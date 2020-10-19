
class Person {
	protected int useridnumber, ownnumber, birthyear, birthmonth, birthday;
	
	public Person(int useridnumber, int ownnumber, int birthyear, int birthmonth, int birthday ) {
		this.useridnumber = useridnumber;
		this.ownnumber = ownnumber;
		this.birthyear = birthyear;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
	}
	public Person(int useridnumber, int birthyear, int birthmonth, int birthday ) {//If person not has ownnumber is none
		this(useridnumber, 0, birthyear, birthmonth, birthday);
	}
//	public void setPerson(int useridnumber, int ownnumber, int birthyear, int birthmonth, int birthday ) {
//		this.useridnumber = useridnumber;
//		this.ownnumber = ownnumber;
//		this.birthyear = birthyear;
//		this.birthmonth = birthmonth;
//		this.birthday = birthday;
//}
public void printThis() {
	System.out.println("useridnumber : "+useridnumber);
	if (ownnumber == 0) System.out.println("ownnumber = none");
	else System.out.println("ownnumber : "+ownnumber);
	System.out.println("birthyear : "+birthyear);
	System.out.println("birthmonth : "+birthmonth);
	System.out.println("birthday : "+birthday+"\n");
}
}
public class ThisExample {

	public static void main(String[] args) {
		Person somepersonmale = new Person(234561234, 1234561234, 1900, 01, 01);
		Person somepersonfemale = new Person(789456, 1800, 02, 02);
		somepersonmale.printThis();
		somepersonfemale.printThis();
	}
}
