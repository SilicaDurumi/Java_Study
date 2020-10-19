import DesignPettern_TempletMethodEx.*;
/*
	TempletMethod Example
*/
public class CarTestExecute {

	public static void main(String[] args) {
		Car car1 = new AICar();
		Car car2 = new ManualCar();
		
		System.out.println("AICar");
		car1.CarRunRutine();
		System.out.println("\n"+"ManualCar");
		car2.CarRunRutine();
		
	}
}
