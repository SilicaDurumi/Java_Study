import AbstractClassEx.*;

//execute class

public class PhoneExecute {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("ABC");
		TelePhone telePhone = new TelePhone("SANS");
		
		System.out.println(smartPhone.owner);
		smartPhone.TurnOn();
		smartPhone.InternetSearch();
		smartPhone.TurnOff();
		System.out.println("\n"+telePhone.owner);
		telePhone.TurnOn();
		telePhone.AutoAnswer();
		telePhone.TurnOff();
	}
}
