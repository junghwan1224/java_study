package java_study;

import java.util.*;

class Air{
	public int temp = 20;
	public int power_control = 0;
	public boolean power = false;
	
	
	void tempUp() {
		this.temp++;
		System.out.println("온도 up " + this.temp);
	}
	
	void tempDown() {
		this.temp--;
		System.out.println("온도 down " + this.temp);
	}
	
	void powerOnOff() {
		if(this.power){
			this.power = false;
			System.out.println("power off");
		}
		else{
			this.power = true;
			System.out.println("power on");
		}
	}
	
	void powerControl() {
		System.out.println("전원 on-3");
		Scanner power_button = new Scanner(System.in);
		power_control = power_button.nextInt();
		
		if(power_control == 3 )
			powerOnOff();
		else
			System.out.println("please press 3");
	}
}

public class Q4_0207 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Air air = new Air();
		boolean flag = true;
		
		
		while(!air.power){
			System.out.println("에어컨 먼저 켜주세요");
			air.powerControl();
		}
		
		
		while(flag) {
			
			Scanner tempCon = new Scanner(System.in);
			int tempConBtn = tempCon.nextInt();
			
			if(tempConBtn == 4)
				flag = false;
			
//			else if(tempConBtn == 3)
//				air.powerControl();
			
			//air.powerControl();
			
			if(! air.power) {
				System.out.println("에어컨 먼저 켜주세요");
				air.powerControl();
			}
			
			else {
				System.out.println("온도 Up-1/온도 Down-2/전원 off-3");
				if(tempConBtn == 1)
					air.tempUp();
					
				else if(tempConBtn == 2)
					air.tempDown();
				
				else if(tempConBtn == 3)
					air.powerControl();
			}
			
			
			
		}
	}

}
