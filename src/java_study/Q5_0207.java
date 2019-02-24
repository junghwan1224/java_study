package java_study;

import java.util.*;

class Tv{
	Boolean power; //전원 
	int channel=10; //채널
	void power() {} //power가 false인 상태였으면 ->true(전원on), true인 상태였으면 ->false(전원off)가 되는 메소드
	
	void channelUp() {} //채널 +1되는 메소드
	
	void channelDown() {} 

}

class CaptionTv extends Tv{
	Boolean power = true;; 
	int channel=10; 
	Boolean caption=false; //캡션(자막) 상태 on/off
	
	@Override
	void power() {
		if(this.power)
			this.power = false;
		else
			this.power = true;
	}
	
	@Override
	void channelUp() {
		this.channel++;
	}
	
	@Override
	void channelDown() {
		this.channel--;
	}
	
	void displayCaption(String text){
		//caption 상태가 on(true)일 때 text를 출력한다.
	}
}


public class Q5_0207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv cap = new CaptionTv();
		cap.channelUp();
		System.out.println("채널은 = " + cap.channel);
		
		System.out.print("자막을 입력하시오.");
		Scanner scan = new Scanner(System.in);
		String channelName = scan.nextLine();
		
		System.out.println("자막 = " + channelName);
	}

}
