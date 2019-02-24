package java_study4;

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scv scv = new Scv(60, 40);
		Tank tank = new Tank(150, 125);
		Dropship ds = new Dropship(125, 110);
		Marine mar = new Marine(60, 60);
		
		scv.repair(tank);
		scv.repair(ds);
		scv.repair(mar);
	}

}
