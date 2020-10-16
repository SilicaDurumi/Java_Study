package AlgorithmClass;

public class Selection_2DarraySorting {
	
	public static void SelectionSort2D() {
		int j,i,m;
		// int rand = (int)(Math.random()*3+2);
		String temp;
		// String[][] str = new String[5][];
		String[][] str = {{"1","ABC","AAA"},{"2","BCD","BBB"},{"3","CDE","CCC"},{"4","DEF","DDD"}};
		// String number = "123456789";
		// String abc1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		// System.out.println("임의로 생성된 문자 \n");
		// for (j = 0; j < str.length; j++)
		// 	for (i = 0;  i<rand; i++) 
		// 			str[j][i] ="";
		// for (j = 0; j < str.length; j++) {
		// 	str[j][0] = Character.toString(number.charAt((int)(Math.random()*number.length()-1)));
		// 	for(m=0;m<str.length;m++) //중복제거를 위한 for문 구조 개선이 필요함
        //         if(str[j][0].compareTo(str[m][0])==0)  
		// 		str[j][0] = Character.toString(number.charAt((int)(Math.random()*number.length()-1)));
		// 	for (i = 0;  i<rand-1; i++) 
		// 		for (m = 0; m < rand; m++) 
		// 			str[j][i+1] += abc1.charAt((int)(Math.random()*abc1.length()-1));
		// }
		//위의 코드를 사용하기 위해서는 배열의 첫번째 숫자를 중복이 없이 랜덤으로 입력시켜야한다.
		for (j = 0; j < str.length; j++) {
			System.out.println("array ["+j+"]\n");
			for (i = 0; i < str[j].length; i++) {
				System.out.println("array["+j+"]"+"["+i+"] = "+str[j][i]);
			}
			System.out.println("");
		}
		System.out.println("");
		
		for (j = 0; j  < str.length;  j++) {
			for (i = 0;  i <str[j].length;  i++) {
				if (str[j][0].compareTo(str[i][0])>0) { //str[j][0]의 값이 str[i][0]의 값보다 큰 경우 코드를 실행
				for(m = 0; m <str[j].length; m++){
						temp = str[j][m];
						str[j][m]=str[i][m];
						str[i][m]= temp;
						}
					}
				}
			}
		
		System.out.println("Sort\n");
		for (j = 0; j < str.length; j++) {
			System.out.println("array ["+j+"]\n");
			for (i = 0; i < str[j].length; i++) {
				System.out.println("array["+j+"]"+"["+i+"] = "+str[j][i]);
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
