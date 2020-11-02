
package ThreadSynchronize;

public class Coustomer1 extends Thread{
	@Override
	public void run() {
		BankMain.bank.DepositMoney(50000);
		System.out.println("Remain : "+BankMain.bank.getMoney());
	
	}
}
