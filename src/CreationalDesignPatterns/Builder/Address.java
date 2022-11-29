package CreationalDesignPatterns.Builder;

public class Address {
	
	private String city;
	private String street;
	private Integer number;
	private String complement;
	
	protected Address() {
	
	}
	
	public static Address builder() {
		return new Address();
	}
	
	public Address city(String city) {
		this.city = city;
		return this;
	}
	
	public Address street(String street) {
		this.street = street;
		return this;
	}
	
	public Address number(Integer number) {
		this.number = number;
		return this;
	}
	
	public Address complement(String complement) {
		this.complement = complement;
		return this;
	}
	
	
	String getCity() {
		return city;
	}
	
	String getStreet() {
		return street;
	}
	
	Integer getNumber() {
		return number;
	}
	
	String getComplement() {
		return complement;
	}
	
	protected void setCity(final String city) {
		this.city = city;
	}
	
	protected void setStreet(final String street) {
		this.street = street;
	}
	
	protected void setNumber(final Integer number) {
		this.number = number;
	}
	
	protected void setComplement(final String complement) {
		this.complement = complement;
	}
	
	@Override
	public String toString() {
		return "Address{" +
		       "city='" + city + '\'' +
		       ", street='" + street + '\'' +
		       ", number=" + number +
		       ", complement='" + complement + '\'' +
		       '}';
	}
}
