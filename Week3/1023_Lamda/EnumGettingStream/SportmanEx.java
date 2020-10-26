package EnumGettingStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import EnumGettingStream.SportmanEnum.Gender;
import EnumGettingStream.SportmanEnum.Location;

public class SportmanEx {
	public static void main(String[] args) {
		List<SportmanEnum> SportmanEnumlist = Arrays.asList(
				new SportmanEnum(Gender.Male, "ABC", 99, Location.Seoul),
				new SportmanEnum(Gender.Female, "BCD", 90, Location.Incheon),
				new SportmanEnum(Gender.Female, "CDE", 80, Location.Incheon),
				new SportmanEnum(Gender.Male, "DEF", 70, Location.Incheon),
				new SportmanEnum(Gender.Female, "EFG", 30, Location.Incheon),
				new SportmanEnum(Gender.Male, "FGH", 19, Location.Seoul));

		Map<SportmanEnum.Gender, List<SportmanEnum>> mapByGender = SportmanEnumlist.stream()
				.collect(Collectors.groupingBy(SportmanEnum::getGender));
		Map<SportmanEnum.Location, List<SportmanEnum>> mapByLocation = SportmanEnumlist.stream()
				.collect(Collectors.groupingBy(SportmanEnum::getLocation));

		System.out.println("* Male info *");
		mapByGender.get(SportmanEnum.Gender.Male).stream()
				.forEach(maleinfo -> System.out.println("Name : " + maleinfo.getName() + "\nAge : " + maleinfo.getAge()
						+ "\nGender : " + maleinfo.getGender().toString() + "\nLocation : "
						+ maleinfo.getLocation().toString() + "\n"));

		System.out.println("* Female info *");
		mapByGender.get(SportmanEnum.Gender.Female).stream()
				.forEach(femaleinfo -> System.out.println("Name : " + femaleinfo.getName() + "\nAge : "
						+ femaleinfo.getAge() + "\nGender : " + femaleinfo.getGender().toString() + "\nLocation : "
						+ femaleinfo.getLocation().toString() + "\n"));

		System.out.println("* Seoul member info *");
		mapByLocation.get(SportmanEnum.Location.Seoul).stream()
				.forEach(seoulinfo -> System.out.println("Name : " + seoulinfo.getName() + "\nAge : "
						+ seoulinfo.getAge() + "\nGender : " + seoulinfo.getGender().toString() + "\nLocation : "
						+ seoulinfo.getLocation().toString() + "\n"));

		System.out.println("* Incheon member info *");
		mapByLocation.get(SportmanEnum.Location.Incheon).stream()
				.forEach(incheoninfo -> System.out.println("Name : " + incheoninfo.getName() + "\nAge : "
						+ incheoninfo.getAge() + "\nGender : " + incheoninfo.getGender().toString() + "\nLocation : "
						+ incheoninfo.getLocation().toString() + "\n"));

//		List<SportmanEnum> maleList = SportmanEnumlist.stream().filter(male -> male.getGender() == Gender.Male)
//				.collect(Collectors.toList());
//		List<SportmanEnum> femaleList = SportmanEnumlist.stream().filter(male -> male.getGender() == Gender.Female)
//				.collect(Collectors.toList());
//		List<SportmanEnum> seoulList = SportmanEnumlist.stream().filter(male -> male.getLocation() == Location.Seoul)
//				.collect(Collectors.toList());
//		List<SportmanEnum> incheonList = SportmanEnumlist.stream().filter(male -> male.getLocation() == Location.Incheon)
//				.collect(Collectors.toList());

//		Stream<SportmanEnum> malesportmanstream = SportmanEnumlist.stream();
//		Stream<SportmanEnum> femalesportmanstream = SportmanEnumlist.stream();
//		Stream<SportmanEnum> seoulsportmanstream = SportmanEnumlist.stream();
//		Stream<SportmanEnum> incheonsportmanstream = SportmanEnumlist.stream();

//		maleList.forEach(maleinfo -> System.out.println("Name : " + maleinfo.getName() + "\nAge : " + maleinfo.getAge()
//				+ "\nGender : " + maleinfo.getGender().toString() + "\nLocation : "
//				+ maleinfo.getLocation().toString() + "\n"));
//		femaleList.forEach(maleinfo -> System.out.println("Name : " + maleinfo.getName() + "\nAge : " + maleinfo.getAge()
//				+ "\nGender : " + maleinfo.getGender().toString() + "\nLocation : "
//				+ maleinfo.getLocation().toString() + "\n"));
//		seoulList.forEach(maleinfo -> System.out.println("Name : " + maleinfo.getName() + "\nAge : " + maleinfo.getAge()
//				+ "\nGender : " + maleinfo.getGender().toString() + "\nLocation : "
//				+ maleinfo.getLocation().toString() + "\n"));
//		incheonList.forEach(maleinfo -> System.out.println("Name : " + maleinfo.getName() + "\nAge : " + maleinfo.getAge()
//				+ "\nGender : " + maleinfo.getGender().toString() + "\nLocation : "
//				+ maleinfo.getLocation().toString() + "\n"));

//		System.out.println("Sportman Male");
//		malesportmanstream.filter(maleinfo -> maleinfo.getGender() == Gender.Male)
//				.forEach(maleinfo -> System.out.println("Name : "+maleinfo.getName()+
//						"\nAge : "+maleinfo.getAge()+"\nGender : "+maleinfo.getGender().toString()
//						+"\nLocation : "+maleinfo.getLocation().toString()+"\n"));

//		System.out.println("Sportman Female");
//		femalesportmanstream.filter(femaleinfo -> femaleinfo.getGender() == Gender.Female)
//				.forEach(femaleinfo -> System.out.println("Name : " + femaleinfo.getName() + "\nAge : "
//				+ femaleinfo.getAge() + "\nGender : " + femaleinfo.getGender().toString() + "\nLocation : "
//				+ femaleinfo.getLocation().toString() + "\n"));

//		System.out.println("Sportman Seoul");
//		seoulsportmanstream.filter(seoulmeminfo -> seoulmeminfo.getLocation() == Location.Seoul)
//				.forEach(seoulmeminfo -> System.out.println("Name : " + seoulmeminfo.getName() + "\nAge : "
//						+ seoulmeminfo.getAge() + "\nGender : " + seoulmeminfo.getGender().toString() + "\nLocation : "
//						+ seoulmeminfo.getLocation().toString() + "\n"));
	}
}
