package Program1012;

import java.util.Scanner;

public class ID_number_check {
	
	public static void main(String[] args) {
		int i;
		String userinput;
		Scanner scanner = new Scanner(System.in);
		String [] userdataarr= new String[5]; 
		String [] userdatainfo = {"Age", "Gender", "Your Address", "Birth", "EarthlyBranches"};
		
		while(true) {
		System.out.print("Write the ID number :");
		userinput = scanner.next().replace("-", "");
		
		if (ID_NumberCheckExcute.UserIdNumberCheck(userinput)) {
			userdataarr[0] = ID_NumberCheckExcute.CheckNumberReturnAge(userinput);
			userdataarr[1] = ID_NumberCheckExcute.CheckNumberReturnGender(userinput);
			userdataarr[2] = ID_NumberCheckExcute.CheckNumberReturnLocation(userinput);
			userdataarr[3] = ID_NumberCheckExcute.CheckNumberReturnBirth(userinput);
			userdataarr[4] = ID_NumberCheckExcute.EarthlyBranches(userdataarr[3]);
								
			for (i = 0; i < userdataarr.length; i++) System.out.println(userdatainfo[i]+" : "+userdataarr[i]);
			System.exit(0);
		}
		else System.out.println("Invalid ID number, Write again please \n");
		}
	}
}
