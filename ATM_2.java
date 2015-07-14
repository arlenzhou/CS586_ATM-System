import java.util.Scanner;

public class ATM_2 {	
	MDA m=new MDA();
	static concreteFactory2 cf2=new concreteFactory2();
	public static dataStore2 d2=new dataStore2();
	public static boolean flag=true;
	public ATM_2(){
		ATM.af=new concreteFactory2();
		//System.out.println(ATM.af.getClass());
		create();
		while(true){
		System.out.println("             *********ATM_2 Selected**********");
		System.out.println("1.card 2.pin 3.deposit 4.withdraw 5.balance 6.exit");
		int num=cf2.in_int();
		switch(num){
		case 1://store pin and balance, done
			float x;   // balance
			int y;// pin
			if(flag==true){
			System.out.println("please create balance:");
			x=cf2.in_float();
			//System.out.println(x);
			System.out.println("please create pin:");
			y=cf2.in_int();
			//System.out.println(y);
			CARD(x,y);
			//System.out.println(d2.balance+" "+d2.pin);
			}
			else{System.out.println("locked");}
			break;
		case 2://check pin done
			if(flag==true){
				while(MDA.attempts<2){
					System.out.print("please enter your pin:");
					y=cf2.in_int();
					PIN(y);
					break;
				}			
				if(MDA.attempts==2){
					System.out.println("too many attempts");}
				break;
				}
			else{System.out.println("locked");}
			break;
		case 3:	//	
			if(flag==true){
				if(MDA.s.getClass()==ready.class){
				    //System.out.println(MDA.s.getClass());
					System.out.println("enter the amout of deposit:");
					ATM_2.d2.deposit=cf2.in_int();
					//System.out.println(ATM_2.d2.deposit);
					DEPOSIT(ATM_2.d2.deposit);
					//System.out.println(ATM_2.d2.balance);
				}
				else if(MDA.s.getClass()==overDrawn.class){
					System.out.println("enter the amout of deposit:");
					ATM_2.d2.deposit=cf2.in_int();
					DEPOSIT(ATM_2.d2.deposit);
				}
			}
			else{System.out.println("locked");}
			break;
		case 4: //withdraw  done
			if(flag==true){
				if(MDA.s.getClass()==ready.class){
				    //System.out.println(MDA.s.getClass());
					System.out.println("enter the amout of withdrawn:");
					ATM_2.d2.withdrawn=cf2.in_int();
					WITHDRAW(ATM_2.d2.deposit);
					//System.out.println(ATM_2.d2.balance);
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
				BALANCE();
			}
			else{System.out.println("locked");}
			break;
		case 6://done
			if(flag==true){
				EXIT();
			}
			else{System.out.println("locked");}
			break;
		
		}
		}		
	}
	
	public void create(){
		m.create();
	}
	public void CARD(float x,int y){
		d2.tempPin=y;
		d2.tempBalance=x;
		//System.out.println(d2.tempPin+"   "+d2.tempBalance);
		m.card();
	}
	public void PIN(int x){
		if(d2.pin==x){
			if(d2.balance>=d2.min){
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
	public void DEPOSIT(float d){
		if(d2.balance+d2.deposit>=d2.min){
		m.depositAboveMin();
		}
		else{
			m.depositBelowMin();
		}
	}
	public void WITHDRAW(float w){
		if(d2.balance-d2.withdrawn>=d2.min){
		m.withdrawAboveMin();
		}
		else if((d2.balance-d2.withdrawn<d2.min)&&(d2.balance-d2.withdrawn>=d2.penalty)){
			m.withdrawBelowMin();
		}
		else{}
		}
	public void BALANCE(){
		m.balance();}
	public void EXIT(){
		m.exit();}
}
