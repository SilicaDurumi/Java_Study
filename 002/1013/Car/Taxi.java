package Car;

public class Taxi extends CarParent{

		
	public static void speedUp(int velocity) {
		speed = speed + velocity;
		
		if (speed>110) speed = 110;
	}
	public static void main(String[] args) {
		CarParent taxi = new CarParent();
		Taxi.speedUp(150);
		
		System.out.println(taxi.speed);
	}

}
