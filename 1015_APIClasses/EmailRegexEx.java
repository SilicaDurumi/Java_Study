import java.util.Iterator;

public class EmailRegexEx {

	public static void main(String[] args) {
		String[] emails = {"fjklasdjf@naver.com","fjlka@gmail.com","eqmlkzxc@hanmail.net","fjasdqzvn@partner.sk.com",
				"fjlkqs@ora.co.kr","qsfnkl@partner.lg.com.kr"};
		String emailPattern ="^\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		
		for (String mail : emails) {
			boolean check = mail.matches(emailPattern);
			
			if (check == true)System.out.println("Correct Email : "+mail);
			else System.out.println("Wrong Email : "+mail);
			
		}
		
	}

}
