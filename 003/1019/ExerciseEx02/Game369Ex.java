package ExerciseEx02;

import java.util.Scanner;
import java.util.Vector;

public class Game369Ex {

	public static void Clap369Game() {
		String userinputvalue; //사용자의 입력값
		int userinputchk, i; // i 반복문 변수, userinputchk 사용자의 입력값이 범위에 맞는지 체크하는 변수
		int clapcount = 0; // 칠 박수
		String resultClapText =  ""; // 결과로 나오는 박수
		Scanner scanner = new Scanner(System.in);
		Vector<String> vector = new Vector<String>();//가변배열
		
		System.out.print("1~9999 사이의 값을 입력하세요>>");
		userinputvalue = scanner.next();
		userinputchk = Integer.parseInt(userinputvalue);// 사용자의 입력값을 정수형으로 변환해서 user inputchk에 넣음
		
		if (userinputchk>=1&&userinputchk<=9999) {
			for (i = 0; i < userinputvalue.length(); i++) 
				vector.add(String.valueOf(userinputvalue.charAt(i))); //userinputvalue를 하나하나씩 쪼개어 vector에 집어넣음
			
			for (i = 0; i < vector.size(); i++) 
				if (vector.get(i).equals("3")||vector.get(i).equals("6")||vector.get(i).equals("9")) 
					clapcount++;
				if(clapcount>0){
					resultClapText = "박수";
				for ( i = 0; i < clapcount; i++) 
					resultClapText +=  "짝";
				}
				else
					System.out.println("입력된 값에 3,6,9가 없습니다.  ");
		}
		else
			System.out.println("입력된 값이 범위를 초과 하였습니다.");
		
		System.out.println(resultClapText);
	}
}
