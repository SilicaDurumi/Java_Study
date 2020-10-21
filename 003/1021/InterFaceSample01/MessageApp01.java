package InterFaceSample01;


public class MessageApp01 implements MessageAppInterface {

	@Override
	public void SayHello(String name) {
		System.out.println("Hello 01, "+name);
		
	}
}
