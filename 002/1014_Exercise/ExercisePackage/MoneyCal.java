package ExercisePackage;

import java.util.Scanner;

public class MoneyCal {
	public static void MoneyCalculator() {
		int usermoney,i;
		int [] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] stockcalculatedmoney = new int[9];
		String[] moneytext = {"��������","������","��õ����","õ����","500��","100��","50��","10��","1��"};
		String[] moneycountstring = {"��","��","��","��","��","��","��","��","��"};
		Scanner scanner = new Scanner(System.in);
		
		System.err.print("�ݾ��� �Է��� �ּ���: ");
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

