package Car;

public class CarParent {
	protected static int speed;
	protected int wheelNumber;
	private String carName;

	public CarParent() {
	}
	
	public CarParent(String name,int velocity) { 
		carName = name;
		speed = velocity;
	}
	
	public void speedSet(int velocity) {
		speed=velocity;
	}
	
}
