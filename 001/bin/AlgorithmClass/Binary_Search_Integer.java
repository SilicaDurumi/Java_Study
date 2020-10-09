package AlgorithmClass;
import java.util.Scanner;

public class Binary_Search_Integer {

	public static void main() {

		int [] data = {30,50,100,110,250,330,500};
		int low = 0;
		int high = data.length-1;
		int mid, find;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Write the number want to find >>");
		find = scanner.nextInt();
		
		while (low <= high) {
			mid = (low+high)/2;
			
			if(find == data[mid]) {
				System.out.println(find+" in "+"array "+(mid+1));
				return;
			}
			if (find > data[mid]) {
				low = mid +1;
			}
			else {
				high = mid-1;
			}
			
		}
		System.out.println("Cannot find "+find+" in array");
		System.out.println("low : "+low+" high : "+high);
	}

}
