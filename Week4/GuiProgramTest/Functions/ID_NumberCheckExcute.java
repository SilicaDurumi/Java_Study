package Functions;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

public class ID_NumberCheckExcute {
	
	public static int i, key, last, k, inputchk;
	public static Calendar cal = Calendar.getInstance(Locale.KOREA);
	public static int year = cal.get(Calendar.YEAR);
	
	public static boolean UserIdNumberCheck(String str) {
		char temp;
		int[] weight = {2,3,4,5,6,7,8,9,2,3,4,5};
		int checksum = 0;
		String idnumber;
		
		idnumber = str.replace("-", "").substring(0,str.length()-1);//delete '-' from str(userinput) string and return the number
		last = (str.charAt(str.length()-1))-48;
		
		for (i = 0; i < weight.length; i++) {
			temp = idnumber.charAt(i);
			checksum += (temp-48) * weight[i];
		}
		
		key = (11-checksum % 11) % 10;
		
		if (key == last) return true;
		else return false;
	}

	public static String CheckNumberReturnAge(String str) {
		String idnumber;
		idnumber = str.replace("-", "").substring(0,str.length()-1);
		int agechk = Integer.parseInt(idnumber.substring(0, 2));
		inputchk= (idnumber.charAt(6))-48;
						
		if (inputchk == 1||inputchk == 2 ||inputchk ==5 ||inputchk==6) agechk+=1900;
		else if (inputchk == 3||inputchk == 4||inputchk==7||inputchk==8) agechk+=2000;
		
		return Integer.toString(year-agechk);
	}
	
	public static String CheckNumberReturnGender(String str) {
		String idnumber;
		idnumber = str.replace("-", "").substring(0,str.length()-1);
		if ((idnumber.charAt(6)-48) % 2 == 0) return "female";
		else return "male";
	}
	
	public static String CheckNumberReturnBirth(String str) {
		String idnumber;
		idnumber = str.replace("-", "").substring(0,str.length()-1);
		
		int Birth = Integer.parseInt(idnumber.substring(0, 2));
		inputchk= (idnumber.charAt(6))-48;
		if (inputchk == 1||inputchk == 2 ||inputchk ==5 ||inputchk==6) Birth+=1900;
		else if (inputchk == 3||inputchk == 4||inputchk==7||inputchk==8) Birth+=2000;
		return Integer.toString(Birth)+"."+idnumber.substring(2, 4)+"."+idnumber.substring(4, 6);
	}
	
	public static String CheckNumberReturnLocation(String str) {
		String idnumber;
		idnumber = str.replace("-", "").substring(0,str.length()-1);
		
		String birthPlace = "";
		int locale = Integer.parseInt(idnumber.substring(7,9));
		
		String[][] localeCode = {{"Seoul","00","08"},{"Busan","09","12"},
                {"Inchoen","13","15"},{"Kyonggi - Do","16","25"},{"Gangwon - Do","26","34"},
                {"Chungbuk - Do","35","39"},{"Daejeon","40","40"},{"Chungnam - Do","41","43"},                  
                {"Chungnam - Do","45","47"},{"Seojong","44","44"},{"Seojong","96","96"},
                {"Jeonbuk - Do","48","54"},{" Jeonnam - Do","55","64"},{"Gwangju","65","66"},
                {"Daegu","67","70"},{"Gyeongbuk - Do","71","80"},{"Gyeongnam - Do","81","84"},
                {"Gyeongnam - Do","86","90"},{"Ulsan","85","85"},{"Jeju - Do","91","95"}};
		
		for(int j=0;j<localeCode.length;j++)
            if( locale >= Integer.parseInt(localeCode[j][1])
                && locale <= Integer.parseInt(localeCode[j][2])) birthPlace = localeCode[j][0];                        
   
		return birthPlace;	
	}

}

