package UserExceptionEx;

import java.util.Scanner;
import EnumExample.PaymentEnum;

public class bill{
	private String payment;
	
	public void bill(String deliverypay, String request) throws Deliveryment{
		System.out.println("\nDelivery Payment : "+deliverypay);
		System.out.println("Requst : "+request+"\n");
		for (PaymentEnum type : PaymentEnum.values())
			System.out.println(type.getTitle());
		System.out.println();
	
		for (PaymentEnum type : PaymentEnum.values()) 
			System.out.println(type.getPayList());
		
		System.out.println();
		
		System.out.print("Write the Payment >> ");
		Scanner scanner = new Scanner(System.in);
		String user_payment = scanner.next();
		
		PaymentEnum paymentEnum = PaymentEnum.FindByPayCode(user_payment); 
		System.out.println("Payment : "+paymentEnum.getTitle());
		payment = paymentEnum.getTitle();
		
		if (deliverypay==null || payment ==null ) 
			throw new Deliveryment("Delivery and Payment must not null");
		else
			System.out.println("Request : "+request+"\nDeliveryment : "+deliverypay);
	}
}



















