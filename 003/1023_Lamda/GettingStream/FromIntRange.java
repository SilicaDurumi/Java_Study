package GettingStream;

import java.util.Random;
import java.util.stream.IntStream;

public class FromIntRange {
	public static int sum;
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 101);		
		IntStream randintstream = new Random().ints(1,46).limit(10);
		
		stream.forEach(intrange -> System.out.println(sum+=intrange));
		System.out.println();
		randintstream.forEach(randint -> System.out.println(randint));
	}
}
