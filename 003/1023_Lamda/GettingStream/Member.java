package GettingStream;

public class Member {
	private String name, gender;
	private int age;
	
	public Member(String gender, String name, int age) {
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


}
