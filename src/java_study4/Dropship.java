package java_study4;

public class Dropship extends AirUnit implements Repairable {
	
	public Dropship(int max, int hp) {
		super(max, hp);
	}

	public String toString() {
		return "Dropship";
	}
}
