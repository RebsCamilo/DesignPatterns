package StructuralDesignPatterns.Decorator;

public abstract class SorveteDecorator implements Sorvete {
	
	//propriedade do SorveteDecorator é uma referencia para um objeto que implemtente a interface Sorvete
	private final Sorvete sorveteDecorator;
	
	protected SorveteDecorator(Sorvete sorveteDecorator) {
		this.sorveteDecorator = sorveteDecorator;
	}
	
	@Override
	public Double informaPreco() {
		return sorveteDecorator.informaPreco();
	}
	
	@Override
	public String informaAdicionais() {
		return sorveteDecorator.informaAdicionais();
	}
}
