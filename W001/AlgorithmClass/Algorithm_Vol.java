package AlgorithmClass;
import java.util.Scanner;

public class Algorithm_Vol {
	public static void AlgorithmSelectMenu() {
		int userinputalgorithm;
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("1. 정수 삽입정렬  \n2. 문자열 삽입정렬 \n"
					+ "3. 2차원 삽입정렬 \n4. 정수 순차검색 \n5. 문자열 순차검색 \n6. 정수 이진검색 \n7. 문자 이진검색 \n"
					+"8. 주민등록번호 확인 \n0. 이전메뉴");
			userinputalgorithm = scanner.nextInt();

			switch (userinputalgorithm) {
		case 1:
			Selection_Sort.SelectionSortInteger();
			break;
		case 2:
			Selection_Sort.SelectionSortString();
			break;
		case 3:
			Selection_2DarraySorting.SelectionSort2D();
			break;
		case 4:
			SequenceSearchAlgorithm.SequenceSearchInteger();
			break;
		case 5:
			SequenceSearchAlgorithm.SequenceSearchString();
			break;
		case 6:
			Binary_Search.BinarySearchInteger();
			break;
		case 7:
			Binary_Search.BinarySearchString();
			break;
		case 8:
			ID_number_check.IdnumberInput();
			break;

		case 0:
				return;
		default:
			break;
		}
		}
		
		
		
	}

}
