package BasicExample;

import java.util.Scanner;

public class Sum_Factorial {

	public static void SumOf1toNumber() {
		Scanner scanner = new Scanner(System.in);
		int i ,j;
		int stack =0;
		
		System.out.print("정수를 입력해주세요 : ");
		i = scanner.nextInt();
		
		for (j= 0; j <= i; j++) {
			stack +=j;
		}
		
		System.out.println("1에서 "+i+" 까지의 합은 : "+stack);
		System.out.println("");
	}

}
