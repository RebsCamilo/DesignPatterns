package BehavioralDesgnPatterns.Strategy;

public class Cash implements PayStrategy {
	
	@Override
	public Double pay(final Double value) {
		return value;
	}
}
