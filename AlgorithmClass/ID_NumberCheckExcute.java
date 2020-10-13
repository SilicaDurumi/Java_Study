package AlgorithmClass;
import java.util.regex.Pattern;

public class ID_NumberCheckExcute {

	public static boolean UserIdNumberCheck(String str) {
		int i, key, last;
		char temp;
		int[] weight = {2,3,4,5,6,7,8,9,2,3,4,5};
		int checksum = 0;
		String idnumber;
		
		idnumber = str.replace("-", "").substring(0,str.length()-1);
		last = (str.charAt(str.length()-1))-48;
		
		for (i = 0; i < weight.length; i++) {
			temp = idnumber.charAt(i);
			checksum += (temp-48) * weight[i];
		}
		
		key = (11-checksum % 11) % 10;
		
		if (key == last) 
			return true;
		else 
			return false;
	}
	public static boolean UserIdNumberCheckRegex(String str) {
//	    return Pattern.matches("^(?:\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$", str);
	    if (Pattern.matches("[0-9]{6}-[1234][0-9]{6}", str))
	    	return true;
	    else if (Pattern.matches("[0-9]{6}[1234][0-9]{6}", str)) 
			return true;
	    else
	    	return false;
	}
}
