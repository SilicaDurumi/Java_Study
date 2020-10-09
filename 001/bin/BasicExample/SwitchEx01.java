package ControlEx;

import java.util.Scanner;

// Corp customer management
//	Normal(C), Gold(B), VIP(A)

public class SwitchEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char customercode;
		String customergrade;
		
		while (true) {
		System.out.print("Customer code >> ");
		customercode = scanner.next().toUpperCase().charAt(0);
	
			switch (customercode) {
			case 'C':
				customergrade = "Normal";
				break;
			case 'B':
				customergrade = "Gold";
				break;
			case 'A':
				customergrade = "VIP";
				break;
			default:
				System.out.println("Invalid code");
				continue;
				
		}
			System.out.println("Customer Grade is "+customergrade);
			System.exit(0);
		}
		}
	}
		
