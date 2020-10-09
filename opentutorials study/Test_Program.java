package Basic_Example;

import java.util.Scanner;

public class Test_Program {
	static String some_text;
	static int some_number;
	public static void main(String[] args) {
		
		Scanner typescan = new Scanner(System.in);
		
		System.out.println("input String : ");
		some_text = typescan.next();
		System.out.println("input number : ");
		some_number = typescan.nextInt();
		
		System.out.println(some_text+" "+some_number);
		
	}

}
