package ThreadSynchronize;

public class Bank {
	private int money = 100000;

	public int getMoney() {return money;	}
	public void setMoney(int money) {this.money = money;}

	public synchronized void DepositMoney(int money) {
		
		try {Thread.sleep(1000);} 
		catch (Exception e) {System.out.println(e.toString());}
		
		this.money +=money;
		System.out.println("\nDeposit Complete");
	}
	public synchronized void WithdrawMoney(int money) {

		try {Thread.sleep(1500);} 
		catch (Exception e) {System.out.println(e.toString());}
		
		this.money -= money;
		System.out.println("\nWithDraw Complete");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	