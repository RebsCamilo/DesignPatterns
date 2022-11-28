package CreationalDesignPattern.Builder;

public class AddressBuilder {
	
	private Address address;
	
	private AddressBuilder() {
		address = new Address();
	}
	
	public static AddressBuilder builder() {
		return new AddressBuilder();
	}
	
	
	public AddressBuilder city(String city) {
		this.address.setCity(city);
		return this;
	}
	
	public AddressBuilder street(String street) {
		this.address.setStreet(street);
		return this;
	}
	
	public AddressBuilder number(Integer number) {
		this.address.setNumber(number);
		return this;
	}
	
	public AddressBuilder complement(String complement) {
		this.address.setComplement(complement);
		return this;
	}
	
	public Address build() {
		return this.address;
	}

}
