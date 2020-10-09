package BasicExample;

import java.util.Scanner;

public class ScannerClassEx {

	public static void VariableScanner() {
		int inputInt;
		double inputdouble;
		String inputstringnext,inputstringnextline;
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 >>> ");
		inputInt = scan.nextInt();
		System.out.println("입력한 숫자는 : "+inputInt);
		
		System.out.print("실수를 입력해주세요 >>> ");
		inputdouble = scan.nextDouble();
		System.out.println("입력한 숫자는 : "+inputdouble);

		System.out.print("공백을 포함하지 않는 문자열을 입력해주세요. >>> ");
		inputstringnext = scan.next();
		System.out.println("공백을 포함하지 않는 문자열 : "+inputstringnext);

		System.out.print("문자열을 입력해주세요. >>> ");
		inputstringnextline = scan.nextLine();
		System.out.println("공백을 포함하는 문자열 : "+inputstringnextline);
		
		System.out.println("");
	}

}
