package java_study4;

public class Tank extends GroundUnit implements Repairable {
	
	public Tank(int max, int hp) {
		super(max, hp);
	}
	
	public String toString() {
		return "Tank";
	}

}
