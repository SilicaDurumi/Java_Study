
public class TimerEx implements Runnable {
	public static double k;
	@Override
	public void run() {
		k = 30;
	    while(k>0)
	    {
	        try {Thread.sleep(1000);} 
	        catch (InterruptedException e) {}
	        k-=1;
	    }
	    if (k == 0) 
	    	System.out.println("Time Over");
	}
}
