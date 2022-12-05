package BehavioralDesgnPatterns.Strategy;

public class DebitCard implements PayStrategy {
	
	@Override
	public Double pay(Double value) {
		return value -= value * 0.01;
	}
}
