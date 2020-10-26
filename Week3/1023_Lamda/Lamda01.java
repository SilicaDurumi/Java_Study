
import LamdaInterfacePackage.*;
public class Lamda01 {

	public static void main(String[] args) {
		MyFunctionInterface01 fi;
		
		fi= () -> {
			String str = "Method Call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("ABC");};
		fi.method();	
		
		fi = () -> {System.out.println("BCD");};
		fi.method();
	}
}
