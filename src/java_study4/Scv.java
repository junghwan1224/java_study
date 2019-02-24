package java_study4;

public class Scv extends GroundUnit implements Repairable {
	
	public Scv(int max, int hp) {
		super(max, hp);
	}
	
	public void repair(Repairable rep) {
		
		if(rep instanceof Tank) {
			Tank t = (Tank)rep;
			while(t.hp != t.MAX_HP)
				t.hp++;
			
			System.out.println(t + "회복 완료");
		}
		
		else if(rep instanceof Dropship) {
			Dropship ds = (Dropship)rep;
			while(ds.hp != ds.MAX_HP)
				ds.hp++;
			
			System.out.println(ds + "회복 완료");
		}
		
		else
			System.out.println("회복할 수 없는 유닛");
	}

}
