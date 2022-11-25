package CreationalDesignPattern.FactoryMethod;

public class RoadLogistics extends Logistics {
	
	@Override
	public Transport createTransport() {
		return new Truck();
	}
}
