package �����ͺм�ó��_����;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigDataProcess {

	public static void main(String[] args) {
		String str = "�������� ���� �ܰ�� �����м��̴�. ���� �����м��� Ű���带 �����ϴ� ����� ��Ƴ��´�.";
		
		//Pattern compile(String regex) �޼ҵ�� �־��� ���� ǥ�������κ��� ������ ������ �޼ҵ�
		Pattern p = Pattern.compile("�����м�");
		
		//Matcher matcher(CharSequence input) �޼ҵ�� ������ ã�� Matcher ��ü�� ����� �޼ҵ�
		Matcher m = p.matcher(str);
		
		int count = 0;   //���� ������ 0���� �ʱ�ȭ
		String word = null;
		
		//find() �޼ҵ�� ������ ��ġ�ϴ� ��� true�� �����ϰ�, �׷��� ������ false ����
		while(m.find()) {
			//group() �޼ҵ�� ��Ī�� �κ��� ��ȯ�ϴ� �޼ҵ�
			word = m.group();
			count++;
		}
		System.out.println("�м����: " + "������ġ");
		System.out.println(word + " " + count + "��");
	}
}
