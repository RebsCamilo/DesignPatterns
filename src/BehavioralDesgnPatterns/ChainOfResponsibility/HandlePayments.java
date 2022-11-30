package BehavioralDesgnPatterns.ChainOfResponsibility;

//A interface declara um método para construir a cadeia de tratores
//Ele também declara um método para executar uma solicitações
public interface HandlePayments {
	public void setNextHandle(HandlePayments tratador);
	public Boolean handlePaymentsBase(Account request);
}
