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
		List<Member> memberlist = Arrays.asList(new Member(Member.Male,"ABC", 99), new Member(Member.Female,"BCD", 90),
				new Member(Member.Female,"CDE", 80), new Member(Member.Male,"DEF", 70), new Member(Member.Male, "EFG", 30));
		
		Stream<Student> studentStream = Stream.of(stuArr);
		Stream<Student> studentinfoStream = Stream.of(stuArr);
		Stream<Member> memberstream = memberlist.stream();
		Stream<Member> memberstreaminfo = memberlist.stream();
		
		double stuScoreAvg = studentStream.mapToInt(Student::getScore).average().getAsDouble();
		double memAgeAvg = memberstream.filter(Maleages -> Maleages.getGender()==Member.Male)
				.mapToInt(Member::getAge)
				.average().getAsDouble();
//		double memAgeAvg = 0;
//		int malecount = 0;
//		
//		for (Member member : memberlist) 
//			if (member.getGender()==Member.Male) {
//				memAgeAvg += member.getAge();
//				malecount++;
//			}
//		memAgeAvg/=malecount;
//		
//		for (int i = 0; i < memberlist.size(); i++) 
//			if (memberlist.get(i).getGender()==Member.Male) {
//				memAgeAvg += memberlist.get(i).getAge();
//				malecount++;
//				}
//		memAgeAvg/=malecount;
		
		
		studentinfoStream.forEach(Studentinfo -> System.out.println("Name : "+Studentinfo.getName()+"\nScore : "+Studentinfo.getScore()+"\n"));
		//display the name&score of the student
		System.out.println("Average of Student : "+stuScoreAvg);
		
//		memberstreaminfo.filter(maleinfo -> maleinfo.getGender()==Member.Male).forEach("Name : "+maleinfo.getName()+"\nAge : "+maleinfo.getAge()));
		System.out.println("Average Age of Male : "+memAgeAvg);

	}

}




























