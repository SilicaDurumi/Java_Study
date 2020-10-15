package ExercisePackage;

import java.util.Scanner;

public class LeapYear {
	public static void LeapYearJudgement() {
		int year;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요>> ");
		year = scanner.nextInt();
	
		if(year%4==0&&year%100==0) System.out.println("평년입니다.");
		else if(year%4==0||year%400==0) System.out.println("윤년입니다.");
		else System.out.println("평년입니다.");
	}
}
