package �ڵ���Ŭ�����𵨸�_����;

/**
 * 
 * �ڽ�(����) Ŭ���� ����
 *
 */

public class Taxi extends CarParent{
	
	//������ ���� => '�޼ҵ� �������̵�' ���� => '������' 
	public void speedUp(int velocity) {
		speed = speed + velocity;  //150
		
		//�ӵ��� ������ �д�. '�ߺμ�' ��ӵ����� ���
		if(speed > 110) {
			speed = 110;
		}
	}
	
	public static void main(String[] args) {
		//�ڽ� Ŭ���� ��ü ����
		Taxi myTaxi = new Taxi();
		
		//�ӵ��� �ø���.
		myTaxi.speedUp(150);
		System.out.println("Taxi speed is " + myTaxi.speed + "�̴�.");

	}

}
