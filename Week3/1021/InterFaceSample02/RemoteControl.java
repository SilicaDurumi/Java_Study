package InterFaceSample02;


public interface RemoteControl {

	public static final int maxVolume = 50;
	public static final int minVolume = 0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	public abstract void volumeUP(); 
	public abstract void volumeDOWN();
	
	default void setMute(boolean mute) {
		if(mute) 		
			System.out.println("Mute On");			
		else
			System.out.println("Mute Off");
	}
	static void changeBatteryWarning() {
		System.out.println("Need to change Battery");
	}
	
	
}
