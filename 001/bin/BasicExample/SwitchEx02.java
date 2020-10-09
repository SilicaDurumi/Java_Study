package ControlEx;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String empgrade;
		
		System.out.print("Employee code >> ");
		empgrade = scanner.next().toUpperCase();
		
		switch (empgrade) {
		case "CEO":
			System.out.println("700000$");
			break;
		case "COO":
			System.out.println("500000$");
			break;
		case "MANGER":
			System.out.println("300000$");
			break;
		default:
			System.out.println("2000$");
			break;
		}

}
}
