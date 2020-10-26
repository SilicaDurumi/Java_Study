
public class Exception02 {

	public static void main(String[] args) {
		try {
			int[] number = new int[4];
			number[5] = 10;
		} catch(Exception e) {
			System.out.println(e);
		}


	}
}
