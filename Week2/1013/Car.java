package 자동차클래스모델링_예제;

public class Car {
	/**
	 * [주위] 클래스의 속성(멤버변수)과 기능(메소드)은 
	 * main() 메소드 밖에서 설정해야 한다.
	 *  
	 */
	//객체가 가져야할 속성 => 멤버변수 선언
	private int speed;		//현재 속도
	private int wheelNum;	//바퀴의 수
	private String carName;	//자동차 이름
	
	//생성자 구현
	public Car(String name) {
		carName = name;
	}
	
	public Car(int velocity) {
		speed = velocity;
	}
	
	public Car(String name, int velocity) {
		carName = name;
		speed = velocity;
	}
	
	//객체의 동작(행위) => 메소드 구현
	/**
	 * [중요] 다형성 => speedUp 메소드를 => '메소드 오버로딩'으로 구현함.
	 */
	public void speedUp() {
		speed = speed + 1;
	}
	
	public void speedup(int velocity) {
		speed = speed + velocity;
	}
	
	public void speedDown() {
		speed = speed - 1;
		if(speed < 0) {
			speed = 0;
		}
	}
	
	public void stop() {
		speed = 0;
	}
	
	public static void main(String[] args) {
		//객체 참조 변수 선언
		Car myCar, yourCar, hisCar;
		
		//Car 클래스(설계도) 객체 생성
		myCar = new Car("에큐스");
		
		//객체 사용
		System.out.println("마이카는 " + myCar.carName + "이다.");
		
		yourCar = new Car(120);
		//유어카의 속도 출력
		System.out.println("유어카의 속도는 " + yourCar.speed + "km 이다.");
		
		//숙제 => hisCar는 제너시스이고 속도는 150km이다.
		hisCar = new Car("제너시스", 150);
		System.out.println(hisCar.carName + "의 현재 속도는 " + hisCar.speed + "이다.");
	}

}









