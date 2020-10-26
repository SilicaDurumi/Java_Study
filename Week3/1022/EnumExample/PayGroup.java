package EnumExample;


import java.util.Scanner;

public class PayGroup {

	public static void main(String[] args) {
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
	
		
	}
}
