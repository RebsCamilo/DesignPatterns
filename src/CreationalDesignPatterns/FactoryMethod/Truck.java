package CreationalDesignPatterns.FactoryMethod;

public class Truck implements Transport{
	
	@Override
	public String delivery() {
		return "Delivery by a truck";
	}
}
