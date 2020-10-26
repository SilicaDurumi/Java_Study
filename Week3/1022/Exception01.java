
public class Exception01 {

	public static void ExceptionExample() throws Exception{
		int number = 50/2;
	}
	
	public static void main(String[] args) {
		try {
			ExceptionExample();
		}catch (Exception e){	
			System.out.println("Error "+e);
		}	
	}
}
