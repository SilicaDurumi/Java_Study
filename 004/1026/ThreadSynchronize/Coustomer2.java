package ThreadSynchronize;

public class Coustomer2 extends Thread{
	@Override
	public void run() {
		BankMain.bank.WithdrawMoney(20000);
		System.out.println("Remain : "+BankMain.bank.getMoney());
		
	}
}
