package GettingStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringAvg {

	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("ABC", 100),
				new Student("BCD", 90),
				new Student("CDE", 80),
				new Student("DEF", 85),
				new Student("EFG", 70),
				new Student("FGH", 75),
				new Student("GHI", 95),
				new Student("HIJ", 100)
		};
		List<Member> memberlist = Arrays.asList(new Member("Male","ABC", 99), new Member("Female","BCD", 90),
				new Member("Female","CDE", 80), new Member("Male","DEF", 70));
		
		Stream<Student> studentStream = Stream.of(stuArr);
		Stream<Student> studentinfoStream = Stream.of(stuArr);
		Stream<Member> memberstream = memberlist.stream();
		
		double stuScoreAvg = studentStream.mapToInt(Student::getScore).average().getAsDouble();
		double memAgeAvg = memberstream.filter(memberinfo -> memberinfo.getGender().equals("Male"))
				.mapToInt(Member::getAge)
				.average().getAsDouble();

		studentinfoStream.forEach(Studentinfo -> System.out.println("Name : "+Studentinfo.getName()+"\nScore : "+Studentinfo.getScore()+"\n"));
		System.out.println("Average of Student : "+stuScoreAvg);
		System.out.println("Average Age of Male : "+memAgeAvg);

	}

}




























