
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;
/*
 * important
 */
import java.util.Vector;

public class VarArgEx {
	static int i;
	public static void display(Vector<String> v) {
		for(Object obj : v) 
			System.out.println("Collection : "+obj);
	}

	public static void display(String ... strs) {
		for(Object obj : strs) 
			System.out.println("VarArg : "+obj);
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		LinkedHashSet<Integer> lotteryNum = new LinkedHashSet<Integer>();
		Vector<String> vector = new Vector<String>(); //size : 10 array
		
		for (i = 0; i < 7; i++) {
			vector.add(Integer.toString(random.nextInt(45)+1));
			lotteryNum.add(random.nextInt(45)+1);
		}
		
//		System.out.println("TreeSet : "+lotteryNum);
		System.out.println("Vector : "+vector);
		
//		vector.set(0, "50");
//		System.out.println("Set 50");
		
		for (i = 0; i < vector.size()-1; i++)
			System.out.println("Number "+(i+1)+" : "+vector.get(i));
		System.out.println("Bonus : "+vector.get(vector.size()-1)+"\n");
		VarArgEx.display("aBC","ABC","ABC","asdsa","ggasdfb");
//		vector.remove(0);
//		System.out.println("Remove 50 And Sort");
//		Collections.sort(vector);
//		VarArgEx.display(vector);
		
//		System.out.println(lotteryNum);
//		for (i = 0; i < lotteryNum.size(); i++)
//			System.out.println("Number "+(i+1)+" : "+((List<String>) lotteryNum).get(i));
//		System.out.println("Bonus : "+((List<String>) lotteryNum).get(lotteryNum.size()-1));
//		VarArgEx.display(lotteryNum);
	}

}



















