import java.util.Scanner;

public class concreteFactory1 extends abstractFactory{
	public store_pin_string getStore_pin(){
		return new store_pin_string();
		}
	public store_balance_int getStore_balance(){
		return new store_balance_int();
		}

	public display_menu getDisplay_menu(){
		return new display_menu();
		}
	public lock getLock(lock l){
		return new lock();
		}
	public unlock getUnlock(){
		return new unlock();
		}
	public make_deposit_int getMake_deposit(){
		return new make_deposit_int();
		}

	public make_withdraw_int getMakewithdraw(){
		return new make_withdraw_int();
		}
	public Penalty_int getPenalty(){
		return new Penalty_int();
		}

	public prompt_for_PIN getPrompt_for_pin(){
		return new prompt_for_PIN();
		}
	
	
	public int in_int(){
		Scanner in=new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}
	public String in_string(){
		Scanner in=new Scanner(System.in);
		String num = in.nextLine();
		return num;
	}
	public void out(String out){
		System.out.println(out);
	}
	public void out(int out){
		System.out.println(out);
	}
}
