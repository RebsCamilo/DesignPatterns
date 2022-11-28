package CreationalDesignPattern.Singleton;
/*
O Singleton é um padrão de projeto criacional que permite a você
garantir que uma classe tenha apenas uma instância, enquanto provê
um ponto de acesso global para essa instância.
*/

public class DriverSingleton { //thread única
	public static void main(String[] args) {
//		DatabaseSingleton singleton = DatabaseSingleton.getInstance("TESTE 1");
//		DatabaseSingleton singleton2 = DatabaseSingleton.getInstance("TESTE 2");
//        System.out.println(singleton.value);
//        System.out.println(singleton2.value);
		
		DatabaseSingleton singleton = DatabaseSingleton.getInstance();
		DatabaseSingleton singleton2 = DatabaseSingleton.getInstance();
		
		singleton.add("Ana");
		singleton2.add("Maria");
		singleton2.add("Raquel");
		
		singleton.show();
	}
}
