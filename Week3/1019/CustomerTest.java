import CustomerInfoPackage.*;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customersomeone = new Customer(10413, "Someone");
		VIPCustomer customerVIP = new VIPCustomer(111413, "SOMEONE", 12345);
		customersomeone.bonusPoint = 1000;
		customerVIP.bonusPoint = 50000;
		int pricesomeone = customersomeone.Calculate(10000, 0.05);
		int priceVIP = customersomeone.Calculate(30000, 0.1);
		int agentID = customerVIP.getAgentID();
		
		System.out.println(customersomeone.showCustomerInfo());
		System.out.println("Price : "+pricesomeone);
		
		System.out.println();
		
		System.out.println(customerVIP.showCustomerInfo());
		System.out.println("Price : "+priceVIP);
		System.out.println("VIP Agent : "+agentID);
		
	}

}
