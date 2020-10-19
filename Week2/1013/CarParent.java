package 자동차클래스모델링_예제;

/** * 
 * 부모(상위) 클래스 구현 *
 */
public class CarParent {
	//객체가 가져야할 속성 => 멤버변수 선언
		protected int speed;	//현재 속도, 초기값 0 => 150
		protected int wheelNum;	//바퀴의 수, 초기값 0
		protected String carName;	//자동차 이름 초기값 null
		
		//[추가] 디폴트 생성자
		/**
		 * 부모 클래스의 생성자가 인자값이 있는 생성자만 있을 때는
		 * 컴파일 시 디폴드 생성자를 생성하지 않는다.
		 * 그러므로 개발자가 인위적으로 디폴드 생성자를 생성해야 한다.
		 */
		public CarParent() {
			
		}
		
		//생성자 구현
		public CarParent(String name) {
			carName = name;
		}
		
		public CarParent(int velocity) {
			speed = velocity;
		}
		
		public CarParent(String name, int velocity) {
			carName = name;
			speed = velocity;
		}
		
		//객체의 동작(행위) => 메소드 구현
		/**
		 * [중요] 다형성 => speedUp 메소드를 => '메소드 오버로딩'으로 구현함.
		 * '메소드 오버로딩' 이란? 하나의 클래스에서 같은 메소드이름이 여러개 존재하는 경우
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
}
