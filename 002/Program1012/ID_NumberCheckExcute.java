package Program1012;

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
	public static boolean UserIdNumberCheckRegex(String str) {
//	    return Pattern.matches("^(?:\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))-[1-4][0-9]{6}$", str);
	    if (Pattern.matches("[0-9]{6}-[1234][0-9]{6}", str)) return true;
	    else if (Pattern.matches("[0-9]{6}[1234][0-9]{6}", str)) return true;
	    else return false;
	}
	public static String CheckNumberReturnAge(String str) {
		int agechk = Integer.parseInt(str.substring(0, 2));
		inputchk= (str.charAt(6))-48;
						
		if (inputchk == 1||inputchk == 2 ||inputchk ==5 ||inputchk==6) agechk+=1900;
		else if (inputchk == 3||inputchk == 4||inputchk==7||inputchk==8) agechk+=2000;
		
		return Integer.toString(year-agechk);
	}
	public static String CheckNumberReturnGender(String str) {
		if ((str.charAt(6)-48) % 2 == 0) return "female";
		else return "male";
	}
	public static String CheckNumberReturnBirth(String str) {
		int Birth = Integer.parseInt(str.substring(0, 2));
		inputchk= (str.charAt(6))-48;
		if (inputchk == 1||inputchk == 2 ||inputchk ==5 ||inputchk==6) Birth+=1900;
		else if (inputchk == 3||inputchk == 4||inputchk==7||inputchk==8) Birth+=2000;
		return Integer.toString(Birth)+"."+str.substring(2, 4)+"."+str.substring(4, 6);
	}
	public static String CheckNumberReturnLocation(String str) {
		String birthPlace = "";
		int locale = Integer.parseInt(str.substring(7,9));
		
		String[][] localeCode = {{"¼­¿ï","00","08"},{"ºÎ»ê","09","12"},
                {"ÀÎÃµ","13","15"},{"°æ±â","16","25"},{"°­¿ø","26","34"},
                {"ÃæºÏ","35","39"},{"´ëÀü","40","40"},{"Ãæ³²","41","43"},                  
                {"Ãæ³²","45","47"},{"¼¼Á¾","44","44"},{"¼¼Á¾","96","96"},
                {"ÀüºÏ","48","54"},{"Àü³²","55","64"},{"±¤ÁÖ","65","66"},
                {"´ë±¸","67","70"},{"°æºÏ","71","80"},{"°æ³²","81","84"},
                {"°æ³²","86","90"},{"¿ï»ê","85","85"},{"Á¦ÁÖ","91","95"}};
		
		for(int j=0;j<localeCode.length;j++)
            if( locale >= Integer.parseInt(localeCode[j][1])
                && locale <= Integer.parseInt(localeCode[j][2])) birthPlace = localeCode[j][0];                        
   
		return birthPlace;	
	}
	public static String EarthlyBranches(String str) {
		String Branches[] = {"Áã", "¼Ò", "È£¶ûÀÌ", "Åä³¢", "¿ë", "¹ì", "¸»", "¾ç" , "¿ø¼þÀÌ", "´ß", "°³", "µÅÁö" };
		String earthlybranchesresult ="";
		int userbirthyear = Integer.parseInt(str.substring(0,4));
		
		for(int i=0; i<Branches.length; i++) {
			if((userbirthyear-4) % 12 == i) 
				earthlybranchesresult = Branches[i];			
		}
		return earthlybranchesresult;
	}
}

