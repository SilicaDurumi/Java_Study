package InterFaceSample02;

public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio Power ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Power Off");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > maxVolume) {
			this.volume = maxVolume;
			System.out.println("Maxinum Volume");
			}
		else if (volume < minVolume) {
			this.volume = minVolume;
			System.out.println("Mininum Volume");
			}
		else 
			this.volume = volume;
		System.out.println("Volume : "+this.volume);
	}

	@Override
	public void volumeUP() {
		this.volume++;
		System.out.println("Volume : "+this.volume);
	}

	@Override
	public void volumeDOWN() {
		this.volume--;
		System.out.println("Volume : "+this.volume);
	}
	
	
}

































