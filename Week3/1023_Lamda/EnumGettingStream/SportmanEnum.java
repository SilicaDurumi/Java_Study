package EnumGettingStream;

public class SportmanEnum {
	public enum Gender {Male, Female}
	public enum Location {Incheon, Seoul}

	private String name;
	private int age;
	private Gender gender;
	private Location location;

	public SportmanEnum(Gender gender,String name, int age, Location location) {
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public Gender getGender() {return gender;}
	public Location getLocation() {return location;}
	public String getName() {return name;}
	public int getAge() {return age;}
}






























