package BasicExample;

import java.util.Scanner;

public class ScannerClassEx {

	public static void VariableScanner() {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 >>> ");
		int inputInt = scan.nextInt();
		System.out.println("입력한 숫자는 : "+inputInt);
		
		System.out.print("실수를 입력해주세요 >>> ");
		double inputdouble = scan.nextDouble();
		System.out.println("입력한 숫자는 : "+inputdouble);

		System.out.print("문자열을 입력해주세요. >>> ");
		String inputstringnextline = scan.nextLine();
		System.out.println("공백을 포함하는 문자열 : "+inputstringnextline+"\n");
		
		System.out.print("공백을 포함하지 않는 문자열을 입력해주세요. >>> ");
		String inputstringnext = scan.next();
		System.out.println("공백을 포함하지 않는 문자열 : "+inputstringnext);
	}

}
