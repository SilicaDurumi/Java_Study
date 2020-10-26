package GettingStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionEx {

	public static void main(String[] args) {
		List<Student> studentslist = Arrays.asList(new Student("ABC", 99), new Student("BCD", 90),
				new Student("CDE", 80), new Student("DEF", 70));
		
		Stream<Student> stream = studentslist.stream();
		stream.forEach(studenttestinfo -> 
		System.out.println("Name : "+studenttestinfo.getName()+"\nScore : "+ studenttestinfo.getScore()+"\n"));
	}
}
