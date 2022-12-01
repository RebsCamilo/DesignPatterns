package BehavioralDesgnPatterns.Observer;
/*
Observer lets you define a subscription mechanism to notify
multiple objects about any events that happen to the object
they’re observing.
An Observer Pattern says that "just define a one-to-one
dependency so that when one object changes state, all its
dependents are notified and updated automatically".
It is also known as Dependents or Publish-Subscribe.
*/

public class DriverObserver {
	
	public static void main(String[] args) {
		Quotation quote = new Quotation("R$", 2.5);
		
		Bank bank = new Bank();
		Investor investor = new Investor();
		QuoteServer quoteServer = new QuoteServer();
		quoteServer.addObserver(bank);
		quoteServer.addObserver(investor);
		quoteServer.notifyObservers(quote);
		
	}

}
