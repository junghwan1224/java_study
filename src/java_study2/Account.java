package java_study2;

import java.util.ArrayList;
import java.util.Scanner;

class AccountStruct {
	public String acc_num;
	public String name;
	public int money;
	
	AccountStruct(String acc_num, String name, int money) {
		this.acc_num = acc_num;
		this.name = name;
		this.money = money;
	}
}


class AccountErrorException extends Exception {
	
	public AccountErrorException(String msg) {
		super(msg);
	}
}


class BankApplication {
	
	public ArrayList<AccountStruct> account_arr;
	
	BankApplication() {
		account_arr = new ArrayList<AccountStruct>();
	}
	
	// 계좌 생성
	public void createAccount(AccountStruct as) {
		this.account_arr.add(as);
	}
	
	// 계좌 목록
	public void readAccount() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		for(AccountStruct as: account_arr) {
			System.out.println(as.acc_num + "\t" + as.name + "\t" + as.money);
		}
	}
	
	// 조회한 계좌 정보 반환
	public AccountStruct getAccount(String acc_num) {
		for(AccountStruct as: account_arr) {
			if(as.acc_num.equals(acc_num))
				return as;
		}
		return null;
	}
	
	// 예금
	public void addAcccount(AccountStruct as, int money) {
		as.money += money;
	}
	
	// 출금
	public void subAccount(AccountStruct as, int money) {
		
		try{
			if(as.money < money) {
				throw new AccountErrorException("잔액 부족");
			}
			as.money -= money;
		}
		catch(AccountErrorException e) {
			e.printStackTrace();
		}
	}
	
	// 종료
	public boolean exitAccount() {
		return false;
	}
}


public class Account {

	public static void main(String[] args) {
		BankApplication bank = new BankApplication();
		boolean flag = true;
		
		while(flag) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			
			System.out.print("선택 > ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			switch(num) {
			case 1: 
				System.out.print("계좌번호: ");
				Scanner sc1 = new Scanner(System.in);
				String acc_num = sc1.nextLine();
				
				System.out.print("계좌주: ");
				Scanner sc2 = new Scanner(System.in);
				String name = sc2.nextLine();
				
				System.out.print("초기입금액: ");
				Scanner sc3 = new Scanner(System.in);
				int money = sc3.nextInt();
				
				AccountStruct as = new AccountStruct(acc_num, name, money);
				
				bank.account_arr.add(as);
				System.out.println("계좌가 생성되었습니다.");
				
				break;
			case 2:
				if(bank.account_arr.size() == 0)
					System.out.println("개설된 계좌가 없습니다.");
				else
					bank.readAccount();

				break;
			case 3: 
				
				System.out.print("예금하실 계좌번호를 입력해주세요: ");
				Scanner scAdd = new Scanner(System.in);
				String acc_numForAdd = scAdd.nextLine();
				
				AccountStruct asForAdd = bank.getAccount(acc_numForAdd);
				if(asForAdd != null){
					System.out.println("계좌번호: " + asForAdd.acc_num);
					System.out.print("예금액: ");
					Scanner scAddMoney = new Scanner(System.in);
					int addMoney = scAddMoney.nextInt();
					
					bank.addAcccount(asForAdd, addMoney);
					System.out.println("예금이 성공되었습니다.");
				}
				else
					System.out.println("입력하신 계좌가 없습니다.");
				
				break;
			case 4: 

				System.out.print("출금하실 계좌번호를 입력해주세요: ");
				Scanner scSub = new Scanner(System.in);
				String acc_numForSub = scSub.nextLine();
				
				AccountStruct asForSub = bank.getAccount(acc_numForSub);
				if(asForSub != null){
					System.out.println("계좌번호: " + asForSub.acc_num);
					System.out.print("출금액: ");
					Scanner scSubMoney = new Scanner(System.in);
					int addMoney = scSubMoney.nextInt();
					
					bank.subAccount(asForSub, addMoney);
					System.out.println("출금이 성공되었습니다.");
				}
				else
					System.out.println("입력하신 계좌가 없습니다.");
				
				break;
			case 5:
			default:
				System.out.println("종료");
				flag = bank.exitAccount();
				break;
			
			}
		}
	}

}
