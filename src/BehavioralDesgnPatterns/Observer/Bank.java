package BehavioralDesgnPatterns.Observer;

public class Bank implements Observer {
	
	@Override
	public void updateNotify(final Quotation quote) {
		System.out.println("BANK, quote changes: " + quote);
	}
}
