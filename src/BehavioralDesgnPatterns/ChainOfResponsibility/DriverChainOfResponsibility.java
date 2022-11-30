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
		Account accountBalanceError = new Account(123, "Ana", 10.0);
		
		System.out.println("Trying to close an account");
		handlePayments(account);
		
		
//	 Tratador cat = new CatTratador();
//	 Tratador squirk = new SquirkTratador();
//	 Account client = new Account();

//	 cat.setNext(squirk);
//
//	System.out.println("Chain cat > squirk");
//	client.askWhichFood(cat);
//
//	System.out.println("Chain squirk");
//	client.askWhichFood();
		
//		Tratador t = tratamentoCompleto();
//		System.out.println(t.trata("fish"));
	}
	
	public static HandlePayments handlePayments(Account account) {
		HandlePayments handlePayments = new verifyNumberHandle();
		handlePayments.setNextHandle(new verifyOwnerHandle());
		handlePayments.setNextHandle(new verifyAccountBalanceHandle());
		return handlePayments;
	}
	
}
