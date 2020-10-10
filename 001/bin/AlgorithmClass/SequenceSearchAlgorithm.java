package AlgorithmClass;

import java.util.Scanner;

public class SequenceSearchAlgorithm {
	public static int i, j, m, stack;
	public static Scanner scan = new Scanner(System.in);
	public static void SequenceSearchInteger() {
		int[] array = new int[7];
		int findint;
		int rand = (int)(Math.random()*10+1);
		
		System.out.println("생성된 난수 \n");
		for (i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*1000+1);
			System.out.println("array["+i+"] = "+array[i]);
		}
		
		stack = 0;
		System.out.print("\n찾을 숫자를 입력하세요 : ");
		findint = scan.nextInt();
		
		for (i = 0; i < array.length; i ++) {
			if (findint == array[i]) {
				System.out.println("\narr["+i+"] = "+array[i]);
				stack++;
			}	
		}
		if (stack>0) 
			System.out.println(stack+"개 발견됨\n");
		else if (stack ==0) 
			System.out.println("값을 찾을 수 없습니다.\n");		

}
	public static void SequenceSearchString() {
		String[] str = new String [7];
		String randstring = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하123456789";
		String temp = "";
		String findstring;

		for (i = 0; i < str.length; i++) {
			for (i = 0;  i<str.length; i++) 
				str[i] ="";
			for (i = 0;  i<str.length; i++) {
				for (j = 0; j < (int)(Math.random()*10+1); j++)
					str[i] += randstring.charAt((int)(Math.random()*randstring.length()));
			}
		}
		for (i = 0; i < str.length; i++) {
			System.out.println("str["+i+"] = "+str[i]);
		}
		
		stack = 0;
		System.out.print("\n찾을 문자를 입력하세요 : ");
		findstring = scan.next();
		System.out.println("");
		
		for (i = 0; i < str.length; i++) {
			for (j = 0; j < str[i].length(); j++) {
				if(str[i].equals(findstring)&&(str[i].equals(temp))== false) {
					temp = str[i];
					System.out.println("'"+findstring+"'는 array["+i+"] = "+str[i]+"입니다.");
					stack++;
					break;
				}
				for (m = 0; m < findstring.length(); m++) {
					if (str[i].charAt(j)== findstring.charAt(m)&& (str[i].equals(temp))== false&&findstring.length()==1) {
						temp = str[i];
						System.out.println("'"+findstring.charAt(m)+"'를 포함하는 배열은 array["+i+"] = "+str[i]);
						stack++;
				}
				}
			}
		}
		if (stack>0) {
			System.out.println(stack+"개 발견됨\n");
		}
		else if (stack ==0) {
			System.out.println("값을 찾을 수 없습니다.\n");
		}
	
	}

}
