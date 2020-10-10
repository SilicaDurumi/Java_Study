package BasicExample;

public class stringarray {
	public static void PrintStringArray() {
		String str[] = {"aabbcc","bbaacc","qqwwaa"};//1차원 문자열 배열
		for (int j = 0; j < str.length; j++) 
			System.out.println("str["+j+"] : "+str[j]);
		System.out.println("");
	}
}
