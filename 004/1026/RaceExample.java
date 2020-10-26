
class Racer extends Thread{
	public Racer(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName()+" Proceed "+(i*10)+"m" );
			
			try {
			sleep(500);} 
			catch (Exception e) {System.out.println(e.toString());}
			System.out.println();
		}
		
		System.out.println(getName()+" Goal In");
	}
}

public class RaceExample {
	public static void main(String[] args) {
		Racer racer1, racer2, racer3;
		
		racer1 = new Racer("PEKORA");
		racer2 = new Racer("GURA");
		racer3 = new Racer("RUSHIA");
		
		racer1.start();
		racer2.start();
		racer3.start();
	}
}






























