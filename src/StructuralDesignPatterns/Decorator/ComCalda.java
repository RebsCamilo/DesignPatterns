package StructuralDesignPatterns.Decorator;

public class ComCalda extends SorveteDecorator {
	
	protected ComCalda(Sorvete sorveteDecorator) {
		super(sorveteDecorator);
	}
	
	@Override
	public Double informaPreco() {
		return super.informaPreco() + 1.0;
	}
	
	@Override
	public String informaAdicionais() {
		return super.informaAdicionais() + ", calda";
	}
}
