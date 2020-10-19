package �ڵ���Ŭ�����𵨸�_����;

/** * 
 * �θ�(����) Ŭ���� ���� *
 */
public class CarParent {
	//��ü�� �������� �Ӽ� => ������� ����
		protected int speed;	//���� �ӵ�, �ʱⰪ 0 => 150
		protected int wheelNum;	//������ ��, �ʱⰪ 0
		protected String carName;	//�ڵ��� �̸� �ʱⰪ null
		
		//[�߰�] ����Ʈ ������
		/**
		 * �θ� Ŭ������ �����ڰ� ���ڰ��� �ִ� �����ڸ� ���� ����
		 * ������ �� ������ �����ڸ� �������� �ʴ´�.
		 * �׷��Ƿ� �����ڰ� ���������� ������ �����ڸ� �����ؾ� �Ѵ�.
		 */
		public CarParent() {
			
		}
		
		//������ ����
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
		
		//��ü�� ����(����) => �޼ҵ� ����
		/**
		 * [�߿�] ������ => speedUp �޼ҵ带 => '�޼ҵ� �����ε�'���� ������.
		 * '�޼ҵ� �����ε�' �̶�? �ϳ��� Ŭ�������� ���� �޼ҵ��̸��� ������ �����ϴ� ���
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
