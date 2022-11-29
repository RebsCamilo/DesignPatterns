package CreationalDesignPatterns.FactoryMethod;

public abstract class Logistics {
	
	public String planDelivery() {
		Transport t = createTransport();
		return t.delivery();
	}
	
	public abstract Transport createTransport();

}
