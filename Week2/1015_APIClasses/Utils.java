import java.text.DecimalFormat;

/*
 utility class
 format(number) method : Get String edited by Pattern 
*/
public class Utils {

	public static String ToNumberFormat(long totalmoney) {
		DecimalFormat moneyform = new DecimalFormat("#,###");
		return moneyform.format(totalmoney);
		
	}
}
