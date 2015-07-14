import java.util.Scanner;


public class ATM_3 {
	MDA m=new MDA();
	static concreteFactory3 cf3=new concreteFactory3();
	public static dataStore3 d3=new dataStore3();
	public static boolean flag=true;
public ATM_3(){
	ATM.af=new concreteFactory3();
	create();
	while(true){
	System.out.println("             *********ATM_3 Selected**********");
	System.out.println("1.card 2.pin 3.deposit 4.withdraw 5.balance 6.exit 7.lock 8.unlock");
	int num=cf3.in_int();
	switch(num){
	case 1://store pin and balance, done
		int x;   // balance
		int y;// pin
		if(flag==true){
		System.out.println("please create balance:");
		x=cf3.in_int();
		System.out.println("please create pin:");
		y=cf3.in_int();
		card(x,y);
		//System.out.println(d3.balance+" "+d3.pin);
		}
		else{System.out.println("locked");}
		break;
	case 2://check pin done
		if(flag==true){
			while(MDA.attempts<1){
				System.out.print("please enter your pin:");
				y=cf3.in_int();
				pin(y);
				break;
			}			
			if(MDA.attempts==1){
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
				ATM_3.d3.deposit=cf3.in_int();
				//System.out.println(ATM_3.d3.deposit);
				deposit(ATM_3.d3.deposit);
				//System.out.println(ATM_1.d1.balance);
			}
			else if(MDA.s.getClass()==overDrawn.class){
				System.out.println("enter the amout of deposit:");
				ATM_3.d3.deposit=cf3.in_int();
				deposit(ATM_3.d3.deposit);
			}
		}
		else{System.out.println("locked");}
		break;
	case 4: //withdraw  done
		if(flag==true){
			if(MDA.s.getClass()==ready.class){
			   // System.out.println(MDA.s.getClass());
				System.out.println("enter the amout of withdrawn:");
				ATM_3.d3.withdrawn=cf3.in_int();
				withdraw(ATM_3.d3.deposit);
				//System.out.println(ATM_3.d3.balance);
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
			y=cf3.in_int();
			if(ATM_3.d3.pin==y){
				lock();
				if(ATM_3.flag==false){ System.out.println("locked");}
			}
			else{
				System.out.println("incorrect pin");
			}
		}
		else{System.out.println("locked");}
		break;
	case 8:
		System.out.println("please enter pin:");
		y=cf3.in_int();
		if(ATM_3.d3.pin==y){
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
public void card(int x,int y){
	d3.tempPin=y;
	d3.tempBalance=x;
	m.card();
}
public void pin(int x){
	if(d3.pin==x){
		if(d3.balance>=d3.min){
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
	if(d3.balance+d3.deposit>=d3.min){
	m.depositAboveMin();
	}
	else{
		m.depositBelowMin();
	}
}
public void withdraw(int w){
	if(d3.balance-d3.withdrawn>=d3.min){
	m.withdrawAboveMin();
	}
	else if((d3.balance-d3.withdrawn<d3.min)&&(d3.balance-d3.withdrawn>=d3.penalty)){
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
