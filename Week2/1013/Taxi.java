package 자동차클래스모델링_예제;

/**
 * 
 * 자식(하위) 클래스 구현
 *
 */

public class Taxi extends CarParent{
	
	//다형성 구현 => '메소드 오버라이딩' 개념 => '재정의' 
	public void speedUp(int velocity) {
		speed = speed + velocity;  //150
		
		//속도에 제한을 둔다. '중부선' 고속도로인 경우
		if(speed > 110) {
			speed = 110;
		}
	}
	
	public static void main(String[] args) {
		//자식 클래스 객체 생성
		Taxi myTaxi = new Taxi();
		
		//속도를 올린다.
		myTaxi.speedUp(150);
		System.out.println("Taxi speed is " + myTaxi.speed + "이다.");

	}

}
