package CreationalDesignPattern.Singleton;

public class Singleton {
	public static Singleton instance;
	public String value;
	
	private Singleton(String value) { //private constructor
		this.value = value;
	}
	
	public static Singleton getInstance(String value) { //static methos call private constructor
		if (instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
	
}
