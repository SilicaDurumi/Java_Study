import InterFaceSample02.Audio;
import InterFaceSample02.RemoteControl;
import InterFaceSample02.Television;

public class InterFaceSample02ExecuteClass {

	public static void main(String[] args) {
		RemoteControl remoteC = new Television();
		
		remoteC.turnOn();
		remoteC.setVolume(20);
		remoteC.volumeUP();
		remoteC.volumeDOWN();
		remoteC.setVolume(51);
		remoteC.setVolume(-1);
		remoteC.setMute(true);
		remoteC.setMute(false);
		remoteC.turnOff();
		RemoteControl.changeBatteryWarning();
		
		remoteC = new Audio();
		
		remoteC.turnOn();
		remoteC.turnOn();
		remoteC.setVolume(20);
		remoteC.volumeUP();
		remoteC.volumeDOWN();
		remoteC.setVolume(51);
		remoteC.setVolume(-1);
		remoteC.turnOff();
		
	
	}
}
