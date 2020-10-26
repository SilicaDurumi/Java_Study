import java.awt.Toolkit;

public class SingleThreadBeepPrintEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {Thread.sleep(1000);} 
			catch (Exception e) {}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			try {Thread.sleep(1000);} 
			catch (Exception e) {}
		}

	}
}
