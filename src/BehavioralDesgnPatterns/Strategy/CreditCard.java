package BehavioralDesgnPatterns.Strategy;

public class CreditCard implements PayStrategy {
	
	@Override
	public Double pay(Double value) {
		return value -= value * 0.05;
	}
}
