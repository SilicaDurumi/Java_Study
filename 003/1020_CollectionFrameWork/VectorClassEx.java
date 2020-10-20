import java.util.Collections;
import java.util.Vector;

public class VectorClassEx {

	public static void main(String[] args) {
		
		int i;
		String[] name = {"DEF","BCD","EFG","CDE","ABC"};
		
		Vector<String> vector = new Vector<String>(4, 3);
		
		System.out.println("Size of vector : "+vector.size());
		System.out.println("Capacity of vector : "+vector.capacity()+"\n");
		System.out.println(vector+"\n");
		
		for (i = 0; i < name.length; i++) 
			vector.add(name[i]);
		
		System.out.println("Size of vector : "+vector.size());
		System.out.println("Capacity of vector : "+vector.capacity()+"\n");
		System.out.println(vector+"\n");
		//[ABC, BCD, CDE, DEF, EFG]
	
		vector.add(2, "AABBCC");
		System.out.println(vector+"\n");
		//[ABC, BCD, AABBCC, CDE, DEF, EFG]
		
		vector.set(0, "SANS");
		System.out.println(vector+"\n");
		
		vector.remove(0);
		System.out.println(vector+"\n");
		
		vector.remove("BCD");
		System.out.println(vector+"\n");
		
		Collections.sort(vector);
		System.out.println(vector+"\n");
		
		Collections.sort(vector,Collections.reverseOrder());
		System.out.println(vector+"\n");
		
	}
}





























