package Example003;

class MyClass{
	int i;

public int getI() {return i;}
}

public class Example01 {
	public static void Example01Execute() {
		MyClass a=new MyClass();
		a.i = 10;
		System.out.println("a = "+a.getI());
	}
}
