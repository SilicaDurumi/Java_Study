import java.util.Hashtable;
import java.util.Scanner;

public class HashTableClassEx {

	public static void main(String[] args) {
		String[] userID = {"ABC","BCD","CDE","DEF","EFG"};
		String[] password = {"123456","654321","q1w2e3r4","!@#$%","%$#@!"};
		String userKey, passwordInput, userpw_value;
		int i;
		boolean FLAG = true;
		
		Scanner scanner = new Scanner(System.in);
		
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		for (i = 0; i < userID.length; i++) 
			hashtable.put(userID[i], password[i]);
		
		System.out.println(hashtable+"\n");
//		{EFG=%$#@!, ABC=123456, DEF=!@#$%, CDE=q1w2e3r4, BCD=654321}
		
		for (i = 0; i < userID.length; i++)
			System.out.println(hashtable.get(userID[i]));	
		
		
		while (FLAG) {
			System.out.print("Write user ID(Write 0 to exit)>>");
			userKey = scanner.next();
			userpw_value = hashtable.get(userKey);
			
			if (userpw_value != null) {
				System.out.print(userKey+"'s PASSWORD >>");
				passwordInput = scanner.next();
				
				if (userpw_value.equals(passwordInput)) 
					System.out.println("True");
				else
					System.out.println("false");
			}
			else if(userKey.equals("0"))
				System.exit(0);
			else
				System.out.println("userID not fond");
		}
		scanner.close();
	}
}















