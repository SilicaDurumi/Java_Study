package ExercisePackage;

import java.util.Scanner;

public class LeapYear {
	public static void LeapYearJudgement() {
		int year;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���>> ");
		year = scanner.nextInt();
	
		if(year%4==0&&year%100==0) System.out.println("����Դϴ�.");
		else if(year%4==0||year%400==0) System.out.println("�����Դϴ�.");
		else System.out.println("����Դϴ�.");
	}
}
