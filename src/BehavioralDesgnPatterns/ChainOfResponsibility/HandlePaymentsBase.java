package BehavioralDesgnPatterns.ChainOfResponsibility;

//Implementação do comportamento padrão de encadeamento
public abstract class HandlePaymentsBase implements HandlePayments {
	private HandlePayments nextHandle;
	
	public HandlePayments getNextHandle() {
		return nextHandle;
	}
	
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
		Boolean verify = this.executeConcreteHandle(account);
		if (nextHandle != null && verify) {
			return nextHandle.handlePaymentsBase(account);
		}
		if (!verify) {
			return Boolean.FALSE;
		}
		return null;
	}
	
	protected abstract Boolean executeConcreteHandle(Account account); //metodo a ser implementado nas classes filhas
	
}
