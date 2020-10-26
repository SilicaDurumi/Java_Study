
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class LamdaEx01 {
	public static void main(String[] args) {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Integer> list = (List) Arrays.asList(10, 20, 30, 40, 50);
		Iterator<Integer> iterator = list.iterator();

		while (iterator.hasNext())
			System.out.println(iterator.next());

		System.out.println();

		Stream<Integer> stream = list.stream();
		stream.forEach(Arr -> System.out.println(Arr)); // consumer has input value but no return value
	}
}
