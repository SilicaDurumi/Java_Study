package UserExceptionEx;

public class Account {
	private long balance;
	
	public Account() {}

	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws BIException {
		System.out.println("Money to withDraw : "+money);
		if (balance-money<0) 
			throw new BIException("Cannot WithDraw over your account Stock>> "+(balance-money));
		else
			balance-=money;
			System.out.println("Current Account Stock : "+balance);
	}
	
}
