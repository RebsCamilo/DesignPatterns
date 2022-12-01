package BehavioralDesgnPatterns.ChainOfResponsibility;
/*
O Chain of Responsibility é um padrão de projeto comportamental que
permite que você passe pedidos por uma corrente de handlers.
Podemos dizer que normalmente cada receptor contém referência de outro
receptor. Se um objeto não puder lidar com a solicitação, ele passará
o mesmo para o próximo receptor e assim por diante.
*/

public class DriverChainOfResponsibility {
	
	public static void main(String[] args) {
		
		Account account = new Account(123, "Ana", 0.0);
		Account accountNumberError = new Account(-123, "Ana", 0.0);
		Account accountBalanceError = new Account(123, "Ana", 10.0);
		
		System.out.println("Trying to close account:");
		if (veriryAccount(account, handlePayments())) {
			System.out.println("Account closed!");
		} else {
			System.out.println("Account can't be closed");
		}
		System.out.println();
		System.out.println("Trying to close accountBalanceError:");
		if (veriryAccount(accountBalanceError, handlePayments())) {
			System.out.println("Account closed!");
		} else {
			System.out.println("Account can't be closed");
		}
		System.out.println();
		System.out.println("Trying to close accountNumberError:");
		if (veriryAccount(accountNumberError, handlePayments())) {
			System.out.println("Account closed!");
		} else {
			System.out.println("Account can't be closed");
		}
	}
	
	public static HandlePayments handlePayments() {
		HandlePayments handlePayments = new verifyNumberHandle();
		handlePayments.setNextHandle(new verifyOwnerHandle());
		handlePayments.setNextHandle(new verifyAccountBalanceHandle());
		return handlePayments;
	}
	
	public static boolean veriryAccount(Account account, HandlePayments handlePayments) {
		if (handlePayments.handlePaymentsBase(account) == null) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
}
