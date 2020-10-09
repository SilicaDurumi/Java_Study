package AlgorithmClass;

import java.util.Random;

public class Selection_2DarraySorting {

	public static void main(String[] args) {
		int j,i,m;
		int rand = (int)(Math.random()*50+1);
		String temp;
		String[][] str = new String[2][rand];
		
		Random random = new Random();
		String abc1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
		System.out.println("Randomly Generated String \n");
		
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
		
		for (j = 0; j  < str.length;  j++) {
			for (i = 0;  i <rand ;  i++) {
				for (m = 0;  m< str.length; m++) {
					if (str[j][i].charAt(0)<str[j][m].charAt(0)) { // '<' ASC, '>' DESC
						temp = str[j][i];
						str[i][j]=str[j][m];
						str[j][m]= temp;
					}
				}
			}
		
	}
		System.out.println("Sort\n");
		for (j = 0; j < str.length; j++) {
			System.out.println("array ["+j+"]\n");
			for (i = 0; i < rand; i++) {
				System.out.println("array["+j+"]"+"["+i+"] = "+str[j][i]);
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
