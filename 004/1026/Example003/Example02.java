package Example003;

class Person{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
}

public class Example02 {
	public static void Example02Execute() {
		Person aPerson = new Person();
		aPerson.setName("홍길동");
		aPerson.setAge(26);
		
		System.out.println("Name : "+aPerson.getName()+"\nAge : "+aPerson.getAge());
	}
}
