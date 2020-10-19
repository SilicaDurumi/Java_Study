package AbstractClassEx;

//Abstract class
public class Phone {	
	//member variable
	public String owner;
	
	public Phone() {}
	//Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	public void TurnOn() {//TurnOn Method
		System.out.println("Turning On the Phone...");
	}
	public void TurnOff() {//TurnOff Method
		System.out.println("Turning Off the Phone...");
	}
}
