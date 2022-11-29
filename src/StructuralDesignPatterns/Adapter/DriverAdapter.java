package StructuralDesignPatterns.Adapter;

/*
O Adapter atua como um wrapper entre dois objetos. Ele captura chamadas
para um objeto e as deixa reconhecíveis tanto em formato como
interface para este segundo objeto.
*/

public class DriverAdapter {
	
	public static void main(String args[]){
		CreditCard targetInterface = new BankCustomerAdapter();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}
	
}
