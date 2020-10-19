package ExercisePackage;

import java.util.Scanner;

public class AlphabetAnalysis {
	public static void OneWord() {
		char alphabet;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 한 자를 입력하세요 : ");
		alphabet = scanner.next().charAt(0);
		if (alphabet<=90 && alphabet>=65) alphabet = (char)(alphabet+32);
		else if(alphabet>=97&&alphabet<=122) alphabet = (char)(alphabet-32);
		else System.out.println("영문자가 아닙니다.");
		System.out.println(alphabet+"\n");
	}
}
