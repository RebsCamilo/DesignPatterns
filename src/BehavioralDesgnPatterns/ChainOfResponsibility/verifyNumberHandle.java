package BehavioralDesgnPatterns.ChainOfResponsibility;

public class verifyNumberHandle extends HandlePaymentsBase {
	
	@Override
	protected Boolean executeConcreteHandle(final Account account) {
		if (account.getNumber() > 0) {
			System.out.println("Passed number validation");
			return Boolean.TRUE;
		}
		System.out.println("Number is invalid");
		return Boolean.FALSE;
	}
	
//	protected String executeConcreteHandle(String request) {
//		if (request.equals("fish")) {
//			return "Cat eats " + request;
//		}
//		return request + " is intact, cats dislikes";
//	}
}
