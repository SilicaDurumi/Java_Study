package AlgorithmClass;

import java.util.Scanner;

public class SequenceSearchAlgorithm {

	public static void main(String[] args) {
		int[] array = new int[7];
		String[] str = new String [7];
		String findstring;
		int i, j,m, findint, stack, userinput;
		int rand = (int)(Math.random()*10+1);
		String temp = "";
		String randstring = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하123456789";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("1. Integer Search \n2. String Search \n3. Exit");
		userinput = scan.nextInt();
		
		switch (userinput) {
		case 1: 
			System.out.println("Randomly Generated Numbers \n");
			for (i = 0; i < array.length; i++) {
				array[i]=(int)(Math.random()*1000+1);
				System.out.println("array["+i+"] = "+array[i]);
			}
			
			stack = 0;
			System.out.print("\nWrite the number to find : ");
			findint = scan.nextInt();
			
			for (i = 0; i < array.length; i ++) {
				if (findint == array[i]) {
					System.out.println("\nThere is the number want you find in array["+i+"] = "+array[i]);
					stack++;
				}	
			}
			if (stack>0) {
				System.out.println(stack+" found\n");
			}
			else if (stack ==0) {
				System.out.println("Value not found\n");
			}
			break;
		case 2:
			for (i = 0; i < str.length; i++) {
				for (i = 0;  i<str.length; i++) 
					str[i] ="";
				for (i = 0;  i<str.length; i++) {
					for (j = 0; j < (int)(Math.random()*10+1); j++)
						str[i] += randstring.charAt((int)(Math.random()*randstring.length()));
				}
			}
			for (i = 0; i < array.length; i++) {
				System.out.println("str["+i+"] = "+str[i]);
			}
			System.out.println("");
			
			stack = 0;
			System.out.print("\nWrite the word to find : ");
			findstring = scan.next();
			System.out.println("");
			
			for (i = 0; i < str.length; i++) {
				for (j = 0; j < str[i].length(); j++) {
					if(str[i].equals(findstring)&&(str[i].equals(temp))== false) {
						temp = str[i];
						System.out.println("Found the Word '"+findstring+"' in array["+i+"] = "+str[i]);
						stack++;
						break;
					}
					for (m = 0; m < findstring.length(); m++) {
						if (str[i].charAt(j)== findstring.charAt(m)&& (str[i].equals(temp))== false&&findstring.length()==1) {
							temp = str[i];
							System.out.println("Found the Word include '"+findstring.charAt(m)+"' find in array["+i+"] = "+str[i]);
							stack++;
					}
					}
				}
			}
			if (stack>0) {
				System.out.println(stack+" found\n");
			}
			else if (stack ==0) {
				System.out.println("Value not found\n");
			}
			break;
			
		case 3:
			System.exit(0);
			break;
		
		default:
			break;
		}
		}
	}

}
