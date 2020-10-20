package ExerciseEx02;

import java.util.Scanner;

public class ID_NumberEx002 {

	public static void ReturnBirthDay() {
		Scanner scanner = new Scanner(System.in);
		String idNumber, birth;
		String[] idNumberSplit = null;
		int inputchk,Birth,i;
		
		System.out.print("Write ID number : ");
		idNumber = scanner.next();
		idNumberSplit = idNumber.split("-");
		Birth = Integer.parseInt(idNumberSplit[0].substring(0, 2));
		
		inputchk= (idNumberSplit[1].charAt(0))-48;
		if (inputchk == 1||inputchk == 2 ||inputchk ==5 ||inputchk==6) 
			Birth+=1900;
		else if (inputchk == 3||inputchk == 4||inputchk==7||inputchk==8) 
			Birth+=2000;
		
		System.out.println(idNumber.replace(idNumber.substring(8,idNumber.length()), "******"));//ABC
		System.out.println(Integer.toString(Birth)+"."+idNumberSplit[0].substring(2, 4)+"."+idNumberSplit[0].substring(4, 6)); 
		
	}
}
