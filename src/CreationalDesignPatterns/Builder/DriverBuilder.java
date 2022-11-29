package CreationalDesignPatterns.Builder;
/*
O Builder é um padrão de projeto criacional que permite a você construir
objetos complexos passo a passo. O padrão permite que você produza diferentes
tipos e representações de um objeto usando o mesmo código de construção.
*/

public class DriverBuilder {
	
	public static void main(String[] args) {
	
		Address address = Address.builder()
		                         .street("Rua teste")
		                         .city("Manaus")
		                         .number(10)
		                         .complement("apto 10");
		System.out.println(address);
		
		Address addressByAddressBuilder = AddressBuilder.builder()
		                                                .street("Rua teste 2")
		                                                .city("João Pessoa")
		                                                .number(20)
		                                                .complement("apto 20")
				                                        .build();
		System.out.println(addressByAddressBuilder);
		
	}
	
}
