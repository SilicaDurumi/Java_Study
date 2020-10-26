package ExerciseEx02;

import java.util.Scanner;

public class ID_NumberEx002 {

	public static void ReturnBirthDay() {
		Scanner ID_numberExinput = new Scanner(System.in);
		String idNumber, name;
		String[] idNumberSplit = null;
		int inputchk,Birth;
		
		System.out.print("Write ID number : ");
		idNumber = ID_numberExinput.next();
		System.out.print("Write your name : ");
		name = ID_numberExinput.next();
//		ID_numberExinput.close();
		idNumberSplit = idNumber.split("-");
		Birth = Integer.parseInt(idNumberSplit[0].substring(0, 2));
		
		inputchk= (idNumberSplit[1].charAt(0))-48;
		if (inputchk == 1||inputchk == 2 ||inputchk ==5 ||inputchk==6) 
			Birth+=1900;
		else if (inputchk == 3||inputchk == 4||inputchk==7||inputchk==8) 
			Birth+=2000;
		
		System.out.println("name : "+name.replaceAll(name.substring(1,name.length()-1), "*"));
		System.out.println(idNumber.replace(idNumber.substring(8,idNumber.length()), "******"));//ABC
		System.out.println(Integer.toString(Birth)+"."+idNumberSplit[0].substring(2, 4)+"."+idNumberSplit[0].substring(4, 6)); 
		
	}
}
