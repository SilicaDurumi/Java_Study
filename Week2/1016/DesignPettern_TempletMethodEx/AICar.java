package DesignPettern_TempletMethodEx;

public class AICar extends Car {

	@Override
	public void Drive() {
		System.out.println("Auto Drive Mode Enabled");
		
	}
	@Override
	public void Stop() {
		System.out.println("Audo Drive mode Disabled");
	}

}
