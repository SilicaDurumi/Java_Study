package AlgorithmClass;

import java.util.Random;
import java.util.Scanner;

public class Search2DAlgorithm {
// 테스트 중
	public static void main(String[] args) {
		int j,i,m;
		String userinput;
		Scanner scanner = new Scanner(System.in);
		int rand = (int)(Math.random()*20+1);
		int stack = 0;
		String temp ="";
		String[][] str = new String[2][rand];
		
		Random random = new Random();
		String abc1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하123456789";// 랜덤으로 집어넣을 문자변수
	
		System.out.println("임의로 생성된 문자 \n");
		
		for (j = 0; j < str.length; j++) {
			for (i = 0;  i<rand; i++) {
				for (m = 0; m < rand; m++) {
					str[j][i] ="";
				}
				for (m = 0; m < rand; m++) {
					str[j][i] += abc1.charAt((int)(Math.random()*abc1.length()));
				}
			}
		}
		for (j = 0; j < str.length; j++) {
			System.out.println("array ["+j+"]\n");
			for (i = 0; i < rand; i++) {
				System.out.println("array["+j+"]"+"["+i+"] = "+str[j][i]);
			}
			System.out.println("");
		}
		System.out.println("");
		
		System.out.print("Type the want to find : ");
		userinput = scanner.next();
		
		for (i = 0; i < str.length; i++) {
			for (j = 0; j < str[i][j].length(); j++) {
				if(str[i].equals(userinput)&&(str[i][j].equals(temp))== false) {
					temp = str[i][j];
					System.out.println("Found the Word '"+userinput+"' in array["+i+"] = "+str[i]);
					stack++;
					break;
				}
				for (m = 0; m < userinput.length(); m++) {
					if (str[i][j].charAt(j)== userinput.charAt(m)&& (str[i].equals(temp))== false&&userinput.length()==1) {
						temp = str[i][j];
						System.out.println("Found the Word include '"+userinput.charAt(m)+"' find in array["+i+"][" +j+"]= "+str[i][j]);
						stack++;
				}
				}
			}
		}
		
	}

}
