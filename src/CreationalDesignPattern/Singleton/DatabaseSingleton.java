package CreationalDesignPattern.Singleton;

import java.util.ArrayList;
import java.util.List;

public class DatabaseSingleton {
	public static DatabaseSingleton instance;
	public List<String> users = new ArrayList<>();
	
	public static DatabaseSingleton getInstance() {
		if (instance == null) {
			instance = new DatabaseSingleton();
		}
		return instance;
	}
	
	public void add(String nome) {
		this.users.add(nome);
	}
	
	public void remove(String nome) {
		this.users.remove(nome);
	}
	
	public void show() {
		for (String nome : users) {
			System.out.println(nome);
		}
	}
}
