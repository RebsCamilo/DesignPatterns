package BehavioralDesgnPatterns.ChainOfResponsibility;

public class verifyAccountBalanceHandle extends HandlePaymentsBase {
	@Override
	protected Boolean executeConcreteHandle(final Account account) {
		if (account.getAccountBalance() == 0) {
			System.out.println("Passed account balance validation");
			return Boolean.TRUE;
		} else if (account.getAccountBalance() > 0) {
			System.out.println("Need to withdraw money from account. The account balance must be 0.");
			return Boolean.FALSE;
		}
		System.out.println("Need to put money in the account. The account balance must be 0.");
		return Boolean.FALSE;
	}
}
