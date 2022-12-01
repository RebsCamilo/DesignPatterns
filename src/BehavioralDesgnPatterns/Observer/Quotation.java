package BehavioralDesgnPatterns.Observer;

public class Quotation {

	private String coin;
	private Double value;
	
	Quotation(final String coin, final Double value) {
		this.coin = coin;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Quotation {coin = " + coin + " | value = " + value + "}";
	}
}
