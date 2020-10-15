package ExercisePackage;

import java.util.Scanner;

public class MoneyCal {
	public static void MoneyCalculator() {
		int usermoney,i;
		int [] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] stockcalculatedmoney = new int[9];
		String[] moneytext = {"오만원권","만원권","오천원권","천원권","500원","100원","50원","10원","1원"};
		String[] moneycountstring = {"매","매","매","매","개","개","개","개","개"};
		Scanner scanner = new Scanner(System.in);
		
		System.err.print("금액을 입력해 주세요: ");
		usermoney = scanner.nextInt();
		
		for (i = 0; i < moneytext.length; i++) {
			stockcalculatedmoney[i] = usermoney/money[i];
			usermoney-=stockcalculatedmoney[i]*money[i];
		}
		for (i = 0; i < moneycountstring.length; i++) 
			if (stockcalculatedmoney[i]==0) continue;
			else System.out.println(moneytext[i]+" : "+stockcalculatedmoney[i]+moneycountstring[i]);
		}
	}

