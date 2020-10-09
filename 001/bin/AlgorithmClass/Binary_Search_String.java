package AlgorithmClass;
import java.util.Scanner;

public class Binary_Search_String {

	public static void main() {
		String [] name = {"ABC","BCD","CDE","DEF","EFG","FGH"};
		int low = 0;
		int high = name.length-1;
		int mid;
		String find;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Write the number want to find >>");
		find = scanner.next();
		
		while (low <= high) {
			mid = (low+high)/2;
			
			if(find.equals(name[mid])) {
				System.out.println(find+" in "+"array "+(mid+1));
				System.exit(0);
			}
			if (find.compareTo(name[mid])>0) 
				low = mid +1;
			else 
				high = mid-1;
		}
		System.out.println("Cannot find "+find+" in array");
	}
}
