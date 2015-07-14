import java.util.Scanner;

public class ATM_1 {
		MDA m=new MDA();
		static concreteFactory1 cf1=new concreteFactory1();
		public static dataStore1 d1=new dataStore1();
		public static boolean flag=true;
	public ATM_1(){
		ATM.af=new concreteFactory1();
		create();
		while(true){
		System.out.println("             *********ATM_1 Selected**********");
		System.out.println("1.card 2.pin 3.deposit 4.withdraw 5.balance 6.exit 7.lock 8.unlock");
		int num=cf1.in_int();
		switch(num){
		case 1://store pin and balance, done
			int x;   // balance
			String y;// pin
			if(flag==true){
			System.out.println("please create balance:");
			x=cf1.in_int();
			System.out.println("please create pin:");
			y=cf1.in_string();
			card(x,y);
			}
			else{System.out.println("locked");}
			break;
		case 2://check pin done
			if(flag==true){
				while(MDA.attempts<3){
					System.out.print("please enter your pin:");
					y=cf1.in_string();
					pin(y);
					break;
				}			
				if(MDA.attempts==3){
					System.out.println("too many attempts");}
				break;
				}
			else{System.out.println("locked");}
			break;
		case 3:	//	
			if(flag==true){
				if(MDA.s.getClass()==ready.class){
				   // System.out.println(MDA.s.getClass());
					System.out.println("enter the amout of deposit:");
					ATM_1.d1.deposit=cf1.in_int();
					//System.out.println(ATM_1.d1.deposit);
					deposit(ATM_1.d1.deposit);
					//System.out.println(ATM_1.d1.balance);
				}
				else if(MDA.s.getClass()==overDrawn.class){
					System.out.println("enter the amout of deposit:");
					ATM_1.d1.deposit=cf1.in_int();
					deposit(ATM_1.d1.deposit);
				}
			}
			else{System.out.println("locked");}
			break;
		case 4: //withdraw  done
			if(flag==true){
				if(MDA.s.getClass()==ready.class){
				    //System.out.println(MDA.s.getClass());
					System.out.println("enter the amout of withdrawn:");
					ATM_1.d1.withdrawn=cf1.in_int();
					withdraw(ATM_1.d1.deposit);
					//System.out.println(ATM_1.d1.balance);
					break;
				}
				 if(MDA.s.getClass()==overDrawn.class){
					System.out.println("sorry, you cannot do that");
				}
			}
			else{System.out.println("locked");}
			break; 
		case 5://done
			if(flag==true){
				balance();
			}
			else{System.out.println("locked");}
			break;
		case 6://done
			if(flag==true){
				exit();
			}
			else{System.out.println("locked");}
			break;
		case 7:
			if(flag==true){
				System.out.println("please enter pin:");
				y=cf1.in_string();
				if(ATM_1.d1.pin.equals(y)){
					lock();
					if(ATM_1.flag==false){ System.out.println("locked");}
				}
				else{
					System.out.println("incorrect pin");
				}
			}
			else{System.out.println("locked");}
			break;
		case 8:
			System.out.println("please enter pin:");
			y=cf1.in_string();
			if(ATM_1.d1.pin.equals(y)){
				unlock();
				if(ATM_1.flag==true){ 
					System.out.println("unlocked");
					}
			}
			else{
				System.out.println("incorrect pin");
			}
			break;
		}
		}		
	}
	
	public void create(){
		m.create();
	}
	public void card(int x,String y){
		d1.tempPin=y;
		d1.tempBalance=x;
		m.card();
	}
	public void pin(String x){
		if(d1.pin.equals(x)){
			if(d1.balance>=d1.min){
				m.CorrectPinAboveMin();
				}
			else{
				System.out.println("below min");
				m.CorrectPinBelowMin();
				}
		}
		else{
			m.IncorectPin(3);
		}	
	}
	public void deposit(int d){
		if(d1.balance+d1.deposit>=d1.min){
		m.depositAboveMin();
		}
		else{
			m.depositBelowMin();
		}
	}
	public void withdraw(int w){
		if(d1.balance-d1.withdrawn>=d1.min){
		m.withdrawAboveMin();
		}
		else if((d1.balance-d1.withdrawn<d1.min)&&(d1.balance-d1.withdrawn>=d1.penalty)){
			m.withdrawBelowMin();
		}
		else{}
		}
	public void balance(){
		m.balance();}
	public void lock(){
		m.lock();}
	public void unlock(){
		m.unlock();}
	public void exit(){
		m.exit();}
}
