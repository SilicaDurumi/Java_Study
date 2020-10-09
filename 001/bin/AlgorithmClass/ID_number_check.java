package AlgorithmClass;
import java.util.Scanner;

public class ID_number_check {
	
	public static void main() {
		int i, j;
		String userinput;
		Scanner scanner = new Scanner(System.in);
		String [][] userdata= new String[1][5]; 
		String [] userdatainfo = {"Name", "Age", "Gender", "Your Address", "Birth"};
		
		while(true) {
		System.out.print("Write the ID number :");
		userinput = scanner.next();
		
		if (ID_NumberCheckExcute.UserIdNumberCheck(userinput)) {
			for (i = 0; i < userdata.length; i++) 
				for (j = 0; j < userdata[0].length; j++) {
					System.out.print("Please Write "+userdatainfo[j]+" : ");
					userinput = scanner.next();
					userdata[i][j]= userinput;
				}
			for (i = 0; i < userdata.length; i++) 
				for (j = 0; j < 5; j++) 
					System.out.println(userdatainfo[j]+" : "+userdata[i][j]);
			System.exit(0);
		}
		else 
			System.out.println("Invalid ID number, Write again please \n");
		}
	}
}
