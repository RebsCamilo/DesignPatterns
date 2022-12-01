package BehavioralDesgnPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class QuoteServer implements Observable {
	
	private List<Observer> observers = new ArrayList<>();
	private Quotation quote;
	
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void newQuotation(Quotation quote) { //set new quote on quote server
		this.quote = quote;
		notifyObservers(quote); //notify state changes
	}
	
	public void notifyObservers(Quotation currencyQuote) {
		observers.forEach(observer -> observer.updateNotify(currencyQuote));
	}
}
