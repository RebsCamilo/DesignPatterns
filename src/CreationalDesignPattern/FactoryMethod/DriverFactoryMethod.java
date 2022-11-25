package CreationalDesignPattern.FactoryMethod;

/*
O Factory Method é um padrão criacional de projeto que fornece uma interface
para criar objetos em uma superclasse, mas permite que as subclasses alterem
o tipo de objetos que serão criados.
Torna o código mais flexível, permitindo futuras alterações.
Aumenta o encapsulamento
*/

public class DriverFactoryMethod {
	
	public static void main(String[] args) {
		System.out.println("DriverFactoryMethod\n");
		
		Logistics logRoad = new RoadLogistics(); //apenas instanciando a logistica, o transport já é definido
		Logistics logSea = new SeaLogistics();

		System.out.println(logRoad.planDelivery());
		System.out.println(logSea.planDelivery());
		
	}
	
}
