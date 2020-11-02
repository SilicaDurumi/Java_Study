package ThreadSynchronize;

public class BankMain {
	
	public static Bank bank  = new Bank();
	
	public static void main(String[] args) {
		
		Coustomer1 coustomer1 = new Coustomer1();
		Coustomer2 coustomer2 = new Coustomer2();
		
		coustomer1.setPriority(Thread.MAX_PRIORITY);
	
		System.out.println("Remain : "+bank.getMoney());
		
		coustomer1.start();
		coustomer2.start();
		}
}



































