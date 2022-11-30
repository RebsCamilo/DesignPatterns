package BehavioralDesgnPatterns.ChainOfResponsibility;

//Geralmente é adequado para trabalhar com um único tratador
// Não sabe que o tratador faz parte da cadeia
public class Account {
	
	private Integer number;
	private String owner;
	private Double accountBalance;
	
	Account(final Integer number, final String owner, final Double accountBalance) {
		this.number = number;
		this.owner = owner;
		this.accountBalance = accountBalance;
	}
	
	Integer getNumber() {
		return number;
	}
	
	String getOwner() {
		return owner;
	}
	
	Double getAccountBalance() {
		return accountBalance;
	}
	
}
