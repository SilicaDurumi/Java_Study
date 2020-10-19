import java.util.Scanner;

public class DecimalFormatEx {
	//number format = 1000 => 1,000/ 100000 => 100,000 / 1000000 => 1,000,000
	public static void main(String[] args) {
		long money;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Write the money >> ");
		money = scanner.nextLong();
		System.out.println("₩"+Utils.ToNumberFormat(money));
	
	}
}
