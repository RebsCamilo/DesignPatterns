package CreationalDesignPatterns.FactoryMethod;

/*
O Factory Method é um padrão criacional de projeto que fornece uma interface
para criar objetos em uma superclasse, mas permite que as subclasses alterem
o tipo de objetos que serão criados.
Permite "adiar" a instanciação para as subclasses.
Torna o código mais flexível, permitindo futuras alterações.
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
