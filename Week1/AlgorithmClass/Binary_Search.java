package AlgorithmClass;
import java.util.Scanner;

public class Binary_Search {

	public static void BinarySearchInteger() {

		int [] data = {10,20,30,40,50,60,130,150,180,335,1000};
		int low = 0;
		int high = data.length-1;
		int mid, find, i;
		Scanner scanner = new Scanner(System.in);

		System.out.print("찾을 숫자를 입력하세요 (10,20,30,40,50,60,130,150,180,335,1000) >>");
		find = scanner.nextInt();
		
		while (low <= high) {
			mid = (low+high)/2;
			
			if(find == data[mid]) {
				System.out.println(find+" 는 "+"array "+(mid+1)+"에 있습니다.\n");
				return;
			}
			if (find > data[mid]) {
				low = mid +1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println("배열 안에서 값 "+find+"을(를) 찾을 수 없습니다.");
		System.out.println("low : "+low+" high : "+high);
	}
	public static void BinarySearchString() {
		String [] name = {"ABC","BCD","CDE","DEF","EFG","FGH"};
		int low = 0;
		int high = name.length-1;
		int mid;
		String find;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열 안에서 찾고 싶은 문자열을 입력하세요(ABC,BCD,CDE,DEF,EFG,FGH) >>");
		find = scanner.next();
		
		while (low <= high) {
			mid = (low+high)/2;
			
			if(find.equals(name[mid])) {
				System.out.println(find+" 은 배열 "+"array "+(mid+1)+"에 있습니다\n");
				return;
			}
			if (find.compareTo(name[mid])>0) 
				low = mid +1;
			else 
				high = mid-1;
		}
		System.out.println("배열 안에서 "+find+"을(를) 찾을 수 없습니다.");
	}

}
