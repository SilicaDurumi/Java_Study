package �ڵ���Ŭ�����𵨸�_����;

public class Car {
	/**
	 * [����] Ŭ������ �Ӽ�(�������)�� ���(�޼ҵ�)�� 
	 * main() �޼ҵ� �ۿ��� �����ؾ� �Ѵ�.
	 *  
	 */
	//��ü�� �������� �Ӽ� => ������� ����
	private int speed;		//���� �ӵ�
	private int wheelNum;	//������ ��
	private String carName;	//�ڵ��� �̸�
	
	//������ ����
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
	
	//��ü�� ����(����) => �޼ҵ� ����
	/**
	 * [�߿�] ������ => speedUp �޼ҵ带 => '�޼ҵ� �����ε�'���� ������.
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
		//��ü ���� ���� ����
		Car myCar, yourCar, hisCar;
		
		//Car Ŭ����(���赵) ��ü ����
		myCar = new Car("��ť��");
		
		//��ü ���
		System.out.println("����ī�� " + myCar.carName + "�̴�.");
		
		yourCar = new Car(120);
		//����ī�� �ӵ� ���
		System.out.println("����ī�� �ӵ��� " + yourCar.speed + "km �̴�.");
		
		//���� => hisCar�� ���ʽý��̰� �ӵ��� 150km�̴�.
		hisCar = new Car("���ʽý�", 150);
		System.out.println(hisCar.carName + "�� ���� �ӵ��� " + hisCar.speed + "�̴�.");
	}

}









