package ExerciseEx02;

import java.util.Scanner;
import java.util.Vector;

public class Game369Ex {

	public static void main(String[] args) {
		String userinputvalue;
		int userinputchk,i;
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> vector = new Vector<Integer>();
		
		System.out.print("1~9999 사이의 값을 입력하세요>>");
		userinputvalue = scanner.next();
		userinputchk = Integer.parseInt(userinputvalue);
		
		if (userinputchk>=1&&userinputchk<=9999) {
			for (i = 0; i < userinputvalue.length(); i++) {
				vector.add((int) userinputvalue.charAt(i));
			}
		System.out.println(vector.get(0));
			
		}
		else
			System.out.println("입력된 값이 범위를 초과 하였습니다.");
	}
}
