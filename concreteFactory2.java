import java.util.Scanner;


public class concreteFactory2 extends abstractFactory {

	public store_pin_int getStore_pin(){
		return new store_pin_int();
		}

	public store_balance_float getStore_balance(){
		return new store_balance_float();
		}
	public display_menu getDisplay_menu(){
		return new display_menu();
		}
	public lock getLock(){
		return new lock();
		}
	public unlock getUnlock(){
		return new unlock();
		}

	public make_deposit_float getMake_deposit(){
		return new make_deposit_float();
		}
	public make_withdraw_float getMakewithdraw(){
		return new make_withdraw_float();
		}


	public Penalty_float getPenalty(){
		return new Penalty_float();
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
		public float in_float(){
			Scanner in=new Scanner(System.in);
			float num=in.nextFloat();
			return num;
		}
		public void out(String out){
			System.out.println(out);
		}
		public void out(int out){
			System.out.println(out);
		}
}
