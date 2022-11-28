package CreationalDesignPattern.Singleton;
/*
O Singleton é um padrão de projeto criacional que permite a você
garantir que uma classe tenha apenas uma instância, enquanto provê
um ponto de acesso global para essa instância.
*/

public class DriverSingleton { //thread única
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance("TESTE 1");
		Singleton singleton2 = Singleton.getInstance("TESTE 2");
        System.out.println(singleton.value);
        System.out.println(singleton2.value);
	}
}
