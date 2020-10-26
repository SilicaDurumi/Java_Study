package InterFaceSample01;


public class MessageApp02 implements MessageAppInterface{

	@Override
	public void SayHello(String name) {
		System.out.println("Hello 02, "+name);
		
	}

}
