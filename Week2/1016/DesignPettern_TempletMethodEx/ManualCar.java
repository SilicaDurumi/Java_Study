package DesignPettern_TempletMethodEx;

public class ManualCar extends Car {

	@Override
	public void Drive() {
		System.out.println("Manual Mode Enabled");
	}

	@Override
	public void Stop() {
		System.out.println("Manual Mode Disabled");
	}

}
