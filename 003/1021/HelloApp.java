import InterFaceSample01.*;

public class HelloApp {

	public static void main(String[] args) {
		MessageApp01 app01 = new MessageApp01();
		MessageApp02 app02 = new MessageApp02();
		
		app01.SayHello("ABC");
		app02.SayHello("BCD");
		
	}
}
