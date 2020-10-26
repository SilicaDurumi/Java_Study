
public class Member {
	public String name, IDNumber;
	public int age;
	
	public Member(String name, int age, String IDNumber) {
		this.name = name;
		this.age = age;
		this.IDNumber = IDNumber;
	}

//	@Override
//	public String toString() {
//		return "Member [name=" + name + ", IDNumber=" + IDNumber + ", age=" + age + ", hashCode()=" + hashCode() + "]";
//	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age) && member.IDNumber.equals(IDNumber);
		}else 
			return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age+IDNumber.hashCode();
	}
}































