
public class TimerEx implements Runnable {
//	Thread thread1 = new Thread(() -> {
//		while(time>0){
//	        try {Thread.sleep(1000);} 
//	        catch (InterruptedException e) {}
//	        time--;
//	    }
//	    if (time == 0) 
//	    	System.out.println("\nTime Over");
//	    });
	
	static double time=30;
	
	@Override
	public void run() {
	    while(time>0){
	        try {Thread.sleep(1000);} 
	        catch (InterruptedException e) {}
	        time-=1;
	    }
	    if (time == 0) 
	    	System.out.println("\nTime Over");
	}
		
}
