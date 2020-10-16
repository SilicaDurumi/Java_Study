package Car;
public class ClassAndObject1 {
	/*
		attributes of object => define member variable
	*/	
	int speed, wheelNumber;
	String carName;

	public ClassAndObject1(String name,int velocity) { 
		carName = name;
		speed = velocity;
	}
	public void speedUpone() {
		speed++;
	}
	public void speedUp(int velocity) {
		speed=speed+velocity;
	}
	public void speedDownone() {
		speed--;
		if (speed < 0) speed =0;
	}
	public void speedDown(int velocity) {
		speed=speed-velocity;
	}
	
	public static void main(String ars[]) {
		ClassAndObject1 car1, car2, car3;
		
		car1 = new ClassAndObject1("WOW", 140);
		car2 = new ClassAndObject1("SANS", 200);
		car3 = new ClassAndObject1("GENOSYS", 150);
		
		System.out.println("Car 1 : "+car1.carName+" Speed : "+car1.speed);
		System.out.println("Car 1 : "+car2.carName+" Speed : "+car2.speed);
		System.out.println("Car 3 : "+car3.carName+" Speed : "+car3.speed);
		
		car1.speedDownone();
		car2.speedDown(100);
				
	}

}
