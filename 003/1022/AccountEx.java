import UserExceptionEx.*;
public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(1000);
		System.out.println(account.getBalance());
		try {
			account.withDraw(500);
		} catch (BIException e) {
			String message = e.getMessage();
			System.out.println(e);
			System.out.println(message);
//			e.printStackTrace();
		}
		//not error 1000
//		Money to withDraw : money
//		Current Account Stock : balance-money

		
	}

}
