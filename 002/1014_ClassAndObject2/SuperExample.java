
class Man {
	String name;
	
	//default generator
	public Man(){}
	public Man(String name) {
		this.name = name;
	}
	//method
	public void PrintUserName() {
		System.out.println("Name is "+name);
	}
}

class BusinessMan extends Man{
	String company, position;
	
	//generator
	public BusinessMan(String company, String name, String position) {
		super(name);
		this.company = company;
		this.position = position;
		
	}
	public void PrintUserInfo() {
		System.out.println("Company : "+company);
		System.out.println("Name : "+name);
		System.out.println("Position : "+position);
	}
	
}

public class SuperExample {
	public static void main(String[] args) {
		BusinessMan someman1 = new BusinessMan("WOW", "SANS", "PAPYRUS");
		BusinessMan someman2 = new BusinessMan("ABC", "BCD", "MANAGER");
		
		System.out.println("First man Info");
		someman1.PrintUserInfo();
		System.out.println("\nSecond man Info");
		someman2.PrintUserInfo();
	}
}
