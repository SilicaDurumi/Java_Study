
public class Exception03 {

	public static void main(String[] args) {
		String[] str = {"10"," 12","14","18","20"};
		int data;
		try {
			data = Integer.parseInt(str[1]);
			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
