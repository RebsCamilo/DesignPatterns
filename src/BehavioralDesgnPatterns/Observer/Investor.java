package BehavioralDesgnPatterns.Observer;

public class Investor implements Observer {
	
	@Override
	public void updateNotify(Quotation quote) {
		System.out.println("INVESTOR, quote changes: " + quote);
	}
}
