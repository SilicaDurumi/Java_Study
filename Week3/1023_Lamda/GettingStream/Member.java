package GettingStream;
 
public class Member {
	private String name;
	public static final int Female = 1;
	public static final int Male = 0;
	int age, gender;
	
	public Member(int gender, String name, int age) {
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public int getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}



}