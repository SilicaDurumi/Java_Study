package AbstractClassEx;

/*
	Inherit Phone
*/
public class TelePhone extends Phone {
	public TelePhone(String onwer) {
		super(onwer);
	}
	public void AutoAnswer() {
		System.out.println("Auto Answer");
	}

}
