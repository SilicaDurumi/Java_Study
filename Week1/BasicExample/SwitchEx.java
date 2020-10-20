package BasicExample;

import java.util.Scanner;

// Corp customer management
//	Normal(C), Gold(B), VIP(A)

public class SwitchEx {

	public static void SwitchControl() {
		Scanner scanner = new Scanner(System.in);
		
		char inputcode;
		String output = "";
		String empgrade;
			
		System.out.print("고객 코드를 입력해주세요(C,B,A) >> ");
		inputcode = scanner.next().toUpperCase().charAt(0);

		switch (inputcode) {//입력받은 변수 inputcode에 따라 실행
			case 'C':
				output = "Normal";
				break;
			case 'B':
				output = "Gold";
				break;
			case 'A':
				output = "VIP";
				break;
			default:
				System.out.println("유효하지 않은 코드입니다.\n");
				break;
		}

		System.out.println("고객 등급 : " +output+"\n");
		System.out.print("사원 코드를 입력하세요(CEO, COO, MANAGER) >> ");
		empgrade = scanner.next().toUpperCase();
		
		switch (empgrade) {
		case "CEO":
			System.out.println("700000$\n");
			break;
		case "COO":
			System.out.println("500000$\n");
			break;
		case "MANGER":
			System.out.println("300000$\n");
			break;
		default:
			System.out.println("2000$\n");
			break;
		// 
		}
	scanner.close();
	}
}
		
