import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayIntList = new ArrayList<Integer>();
		
		arrayIntList.add(new Integer(1));
		arrayIntList.add(new Integer(1231));
		arrayIntList.add(new Integer(5121));
		arrayIntList.add(new Integer(1412));
		arrayIntList.add(new Integer(12));
		
		arrayIntList.add(2, 9874);
		System.out.println(arrayIntList+"\n");
		
		arrayIntList.set(4, 9999);
		System.out.println(arrayIntList);
	}
}
