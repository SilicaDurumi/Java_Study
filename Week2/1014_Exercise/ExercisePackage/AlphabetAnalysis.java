package ExercisePackage;

import java.util.Scanner;

public class AlphabetAnalysis {
	public static void OneWord() {
		char alphabet;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �� �ڸ� �Է��ϼ��� : ");
		alphabet = scanner.next().charAt(0);
		if (alphabet<=90 && alphabet>=65) alphabet = (char)(alphabet+32);
		else if(alphabet>=97&&alphabet<=122) alphabet = (char)(alphabet-32);
		else System.out.println("�����ڰ� �ƴմϴ�.");
		System.out.println(alphabet+"\n");
	}
}
