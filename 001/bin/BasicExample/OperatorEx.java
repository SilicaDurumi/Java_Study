package BasicExample;

import java.util.Scanner;

public class OperatorEx {
	
	public static void Operator_PriorityAndIf() {
		
		int var1 = 10;
		int var2 = 20;
		int var3 = 30;
		int a, b, c, studentscore;
		double result;
		String grade;

		Scanner scanner = new Scanner(System.in);
		
		result = 100.0*2.0/3.0%5.0;		
		result = var3%var1+var2*var3;
		a = b = c = 5;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("double Type : "+result+", Int type : "+(int)result);
		System.out.println("");
		
		while(true) {
			System.out.print("점수를 입력해주세요(0~100) >>");
			studentscore = scanner.nextInt();
			if (studentscore<=100&&studentscore>=0) {
	
				grade = studentscore >= 90 ? "A":
											studentscore >= 80 ? "B":
											studentscore >= 70 ? "C":
											studentscore >= 60 ? "D" : "F";
											
				System.out.println("등급 : "+grade);
				System.exit(0);
			}
			else {
				System.out.println("점수는 0~100 사이의 값만 입력해주세요/");
				continue;
			}
			}
		}
	}
}
