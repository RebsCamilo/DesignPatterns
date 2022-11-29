package StructuralDesignPatterns.Decorator;

public class ComGotasDeChocolate extends SorveteDecorator {
	
	protected ComGotasDeChocolate(final Sorvete sorveteDecorator) {
		super(sorveteDecorator);
	}
	
	@Override
	public Double informaPreco() {
		return super.informaPreco() + 2.0;
	}
	
	@Override
	public String informaAdicionais() {
		return super.informaAdicionais() + ", gotas de chocolate";
	}
}
