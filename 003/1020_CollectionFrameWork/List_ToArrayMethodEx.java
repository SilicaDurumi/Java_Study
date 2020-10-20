import java.util.ArrayList;
import java.util.List;

public class List_ToArrayMethodEx {
	
	private static void runExample01() {
		List<String> strList = new ArrayList<String>();
		
		strList.add("JAVA");
		strList.add("Oracle");
		strList.add("JSP");
		strList.add("Javascript");
		strList.add("MYSQL");
		
		String[] strArray = strList.toArray(new String[strList.size()]);
		
		for (int i = 0; i < strArray.length; i++) 
			System.out.println("List"+(i+1)+" : "+strArray[i]+"");
		System.out.println();
	}
	private static void runExample02() {
		List<User> userList = new ArrayList<User>();
		userList.add(new User("ABC", 10));
		userList.add(new User("SANS", 111));
		
		User[] userinfo = userList.toArray(new User[userList.size()]);
		
		userinfo[1].setAge(999);
		
		for (int i = 0; i < userList.size(); i++) 
			System.out.println("UserName : "+userinfo[i].getName()+"\nUserAge : "+userinfo[i].getAge()+"\n");
	}
	public static void main(String[] args) {
		runExample01();
		runExample02();
		
	}
}































