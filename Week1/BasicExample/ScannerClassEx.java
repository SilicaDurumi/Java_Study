package BasicExample;

import java.util.Scanner;

public class ScannerClassEx {

	public static void VariableScanner() {
		int inputInt;
		double inputdouble;
		String inputstringnext,inputstringnextline;
		Scanner scan = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 >>> ");
		inputInt = scan.nextInt();//정수를 입력받습니다.
		System.out.println("입력한 숫자는 : "+inputInt);//입력받은 변수를 출력합니다.
		
		System.out.print("실수를 입력해주세요 >>> ");
		inputdouble = scan.nextDouble();//실수를 입력받습니다.
		System.out.println("입력한 숫자는 : "+inputdouble);//입력받은 변수를 출력합니다.

		System.out.print("공백을 포함하지 않는 문자열을 입력해주세요. >>> ");
		inputstringnext = scan.next();//공백을 포함하지 않는 문자열을 입력받습니다.
		System.out.println("공백을 포함하지 않는 문자열 : "+inputstringnext);//입력받은 변수를 출력합니다.

		inputstringnextline = scan.nextLine(); //없을 시 next로 입력받은 엔터 때문에 다음의 nextLine이 실행되지 않고 무시됨

		System.out.print("문자열을 입력해주세요. >>> ");
		inputstringnextline = scan.nextLine();//공백을 포함하는 문자열을 입력받습니다.
		System.out.println("공백을 포함하는 문자열 : "+inputstringnextline);//입력받은 변수를 출력합니다.
		
		System.out.println("");
	}

}
