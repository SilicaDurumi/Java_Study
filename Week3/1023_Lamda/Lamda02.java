
import LamdaInterfacePackage.*;
public class Lamda02 {

	public static void main(String[] args) {
		MyFunctionInterface02 fi;
		
		fi = (x) ->{
			int result = x+5;
			System.out.println(result);
		};
		fi.method(3);
		
	}

}
