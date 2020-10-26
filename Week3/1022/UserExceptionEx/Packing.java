package UserExceptionEx;

import java.util.Scanner;

public class Packing {
	private String deliveryPayment;
	private String request;
	int userinput;
	Scanner scanner = new Scanner(System.in);
	
	public Packing() {}

	public void PackingDelivery(){
		bill bill = new bill();
		
		System.out.print("Write any requests about Delivery : ");
		this.request = scanner.nextLine();
		
		System.out.print("DeliveryPayment (1.advance 2.deferred) : ");
		
		try {
			userinput = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Only Write number");
			
		}
		
		if (userinput== 1) 
			this.deliveryPayment = "Advance";
		else if(userinput == 2) 
			this.deliveryPayment = "Deferred";
		else 
			System.out.println("Invalid Number");
			
		try {
			bill.bill(this.deliveryPayment, this.request);
		} catch (Deliveryment e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
}
