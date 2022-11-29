package StructuralDesignPatterns.Decorator;

public class SorteveSimples implements Sorvete {
	
	private String nome = "Sorvete SIMPLES";
	
	@Override
	public Double informaPreco() {
		return 2.0;
	}
	
	@Override
	public String informaAdicionais() {
		return "Sorvete de creme";
	}
	
	public String getNome() {
		return nome;
	}
}
