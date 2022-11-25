package CreationalDesignPattern.FactoryMethod;

public class Ship implements Transport{
	
	@Override
	public String delivery() {
		return "Delivery by a ship";
	}
}
