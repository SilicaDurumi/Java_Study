package ControlEx;

import java.util.Scanner;

public class Sum_Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double i ,j;
		double stack =0;
		
		System.out.print("Write number : ");
		i = scanner.nextInt();
		
		for (j= 0; j <= i; j++) {
			stack +=j;
		}
		
		System.out.println("Sum of 1 to "+i+" is "+stack);
		stack =1;
		
		for (j = 1; j <= i; j++) {
			stack *=j;
		}
		System.out.println("Factorial of "+i+" is "+stack);
		
	}

}
