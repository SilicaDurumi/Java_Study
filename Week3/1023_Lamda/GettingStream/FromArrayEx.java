package GettingStream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {
	public static void main(String[] args) {
		int[] intArray = {100, 200, 300, 400 ,500};
		IntStream intStream = Arrays.stream(intArray);
		String[] strArray = {"ABC", "BCD", "CDE", "DEF", "EFG"};
		Stream<String> strStream = Arrays.stream(strArray);
		
		strStream.forEach(str -> System.out.println(str));
		System.out.println();
		intStream.forEach(intarr -> System.out.print(intarr+" "));
	}
}
