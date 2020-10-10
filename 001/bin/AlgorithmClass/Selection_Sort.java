package AlgorithmClass;

public class Selection_Sort {
	public static int i,j;
	public static void SelectionSortInteger() {//정수 1차원 선택정렬
		int[] array = new int[7];
		int tmp;
		
		System.out.println("난수 \n");
		for (i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10000);//0부터 ~9999까지의 난수를 생성하며 배열안에 넣는다.
			System.out.println(array[i]);//생성한 난수를 출력한다
		}
		System.out.println("");
		
		for (i = 0; i  < array.length;  i++) {
			for (j = 0;  j <array.length ;  j++) {
				if (array[i]<array[j]) { // '<' ASC, '>' DESC
					tmp = array[i];
					array[i]=array[j];
					array[j]= tmp;
				}
				}
			System.out.println("삽입정렬 "+(i+1)+" (ASC)\n");//정렬과정을 순차적으로 보여주기 위한 코드
			for (tmp= 0; tmp < array.length; tmp++) {
				System.out.println(array[tmp]);
			}
			System.out.println("");
			}
		
		System.out.println("\n오름차순 정렬"+"\n");
		for (j =  0; j  < array.length; j++) 
			System.out.println(array[j]);
		
		System.out.println("\n내림차순 정렬"+"\n");
		for (j =  array.length-1; j  >= 0; j--) 
			System.out.println(array[j]);
		System.out.println("");
	}
	public static void SelectionSortString() {//문자열 선택 정렬
		String[] array = new String[7];// 크기 7의 빈 배열
		String tmp;
		int rand = (int)(Math.random()*50+1); //1부터 50까지의 난수
		String abc1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하";//랜덤으로 넣을 문자열
	
		System.out.println("랜덤 문자열 \n");
		
		for (j = 0; j < array.length; j++) {
			for (i = 0;  i<rand; i++) 
				array[j] ="";// 빈 배열을 생성하면 기본적으로 Null값이 배열에 채워지기 때문에 빈문자로 채워주는 과정
			for (i = 0;  i<rand; i++) 
				array[j] += abc1.charAt((int)(Math.random()*abc1.length()));// abc1에 들어간 문자열을 하나하나쪼갠다. 그 후 쪼갠 문자열을 임의의 길이로 array에 집어넣는다.
		}
		
		for (j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		System.out.println("");
		
		for (i = 0; i  < array.length;  i++) {
			for (j = 0;  j <array.length ;  j++) {
				if (array[i].charAt(0)<array[j].charAt(0)) { // '<' ASC, '>' DESC
					tmp = array[i];
					array[i]=array[j];
					array[j]= tmp;
				}
				else if (array[i].charAt(0)==array[j].charAt(0)) { 	
				}//중복값이 생기는 경우
				}
			System.out.println("삽입정렬 "+(i+1)+" (DESC)\n");
			for (int k = 0; k < array.length; k++) {
				System.out.println(array[k]);
			}
			System.out.println("");
			}
		
		System.out.println("\n내림차순 정렬"+"\n");
		for (j =  array.length-1; j  >= 0; j--) 
			System.out.println(array[j]);
		
		System.out.println("\n오름차순 정렬"+"\n");
		for (j =  0; j  < array.length; j++) 
			System.out.println(array[j]);
		System.out.println("");
	}
	
}

