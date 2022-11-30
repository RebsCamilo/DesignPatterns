package BehavioralDesgnPatterns.ChainOfResponsibility;

//Implementação do comportamento padrão de encadeamento
public abstract class HandlePaymentsBase implements HandlePayments {
	private HandlePayments nextHandle;
	
	@Override
	public void setNextHandle(HandlePayments tratador) {
		if (nextHandle == null) {
			this.nextHandle = tratador;
		} else {
			nextHandle.setNextHandle(tratador);
		}
	}
	
	@Override
	public Boolean handlePaymentsBase(Account account) {
		executeConcreteHandle(account);
//		Boolean retorno = executeConcreteHandle(account);
//		System.out.println(retorno);
		if (nextHandle != null) {
			return nextHandle.handlePaymentsBase(account);
		}
		return null;
	}
	
	protected abstract Boolean executeConcreteHandle(Account account); //metodo a ser implementado nas classes filhas
	
}
