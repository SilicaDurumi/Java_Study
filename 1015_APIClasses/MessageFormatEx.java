import java.text.MessageFormat;

public class MessageFormatEx {
	/*
		store data, transport to network, **Write some sql database** => setting format
		useful reference opentutorials java1
	*/
	public static void main(String[] args) {
		String id = "ABC1234";
		String name = "SANS";
		String tel = "1335-123-1365";
		String[] userinfo = {"\"ABC1234\"","\"PAPYRUS\"", "1331-1231-1365"};
		String text = "UserID : {0} \nUserName : {1} \nTel: {2}";//pattern
		String sql = "INSERT INTO MEMBER VALUES({0}, {1}, {2});";//pattern
		
		String result1 = MessageFormat.format(text, id, name, tel);
		String result2 = MessageFormat.format(sql, userinfo);
		System.out.println(result1+"\n");
		System.out.println(result2);
		
	}

}
