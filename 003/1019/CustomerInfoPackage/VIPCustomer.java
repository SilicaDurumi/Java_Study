package CustomerInfoPackage;


public class VIPCustomer extends Customer {
//	private int customerID, bonusPoint; 
//	private String customerName, customerGrade;
//	private double bonusRatio;
	double saleRatio;
	private int agentID;
	//agentID, saleRatio => for VipCustomer
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	public int Calculate(int price, double bonusRatio) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		return "Customer name : "+customerName+"\nGrade : "+customerGrade+"\nPoint : "+bonusPoint;
	}
}





























