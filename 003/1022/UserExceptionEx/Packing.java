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
		userinput = scanner.nextInt();
		
		if (userinput== 1) 
			this.deliveryPayment = "Advance";
		else if(userinput == 2)
			this.deliveryPayment = "Deferred";
		
		try {
			bill.bill(this.deliveryPayment, this.request);
		} catch (Deliveryment e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
}
