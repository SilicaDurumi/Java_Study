package CustomerInfoPackage;


public class Customer {

	protected int customerID;
	public int bonusPoint;
	protected String customerName, customerGrade;
	protected double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "GENERAL";
		bonusRatio = 0.01;
	}
	public Customer() {
	}
	
	public int Calculate(int price, double bonusRatio) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return "Customer name : "+customerName+"\nGrade : "+customerGrade+"\nPoint : "+bonusPoint;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
}

























