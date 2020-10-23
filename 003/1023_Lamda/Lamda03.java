import LamdaInterfacePackage.*;
public class Lamda03 {

	public static void main(String[] args) {
		MyFunctionInterface03 fi;
		
		fi =(x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(fi.method(10, 20));
		
		fi = (x,y) -> {return x+y;};
		System.out.println(fi.method(20, 30));
		
		fi = (x,y) -> x + y;
		System.out.println(fi.method(50, 60));
	}
}
