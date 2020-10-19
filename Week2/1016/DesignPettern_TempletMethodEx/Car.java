package DesignPettern_TempletMethodEx;

public abstract class Car {
	//Abstract Method declare
	public abstract void Drive();
	public abstract void Stop();
	
	//Normal Method
	public void StartUp() {
		System.out.println("Start");
	}
	public void TurnOff() {
		System.out.println("Off");
	}
	
	//Templet Method
	final public void CarRunRutine() {
		StartUp();
		Drive();
		Stop();
		TurnOff();
	}
}
