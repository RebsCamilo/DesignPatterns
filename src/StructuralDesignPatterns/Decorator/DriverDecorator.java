package StructuralDesignPatterns.Decorator;
/*
O Decorator é um padrão de projeto estrutural que permite que você acople
novos comportamentos para objetos ao colocá-los dentro de invólucros de
objetos que contém os comportamentos.
O Decorator usa composição em vez de herança para estender a funcionalidade
de um objeto em tempo de execução.
*/
public class DriverDecorator {
	
	public static void main(String[] args) {
		Sorvete sorvete = new SorteveSimples();
		//acrescentando adicionais (decorando a "classe base")
		sorvete = new ComCalda(sorvete);
		sorvete = new ComGotasDeChocolate(sorvete);
		//os metodos chamam primeiro metodo o da classe base, depois o proximo da pilha... seguindo ate o ultimo
		System.out.println(sorvete.informaPreco());
		System.out.println(sorvete.informaAdicionais());
		
	}
	

}
