
public class MDA {
	static int attempts=0;  
	public static State s=new State();    //these are states
	State idle=new idle();
	State checkPin=new checkPin();
	State ready=new ready();
	State overDrawn=new overDrawn();
	State locked=new locked();
	
	public void create(){
		s=idle;	
	}
	public void card(){ //done
		attempts=0;
		s=idle;
		s.card();
		s=checkPin;
		//System.out.println(s.getClass());
	}
	public void IncorectPin(int max){
		System.out.println("incorrect pin");
		attempts++;
		if(attempts<max){
			s=checkPin;
			//System.out.println(s.getClass());
		}
		else{
			s=idle;
			//System.out.println(s.getClass());
		}
	}
	public void CorrectPinBelowMin(){
		System.out.println("correct pin below min");
		s=overDrawn;
		s.CorrectPinBelowMin();
		//System.out.println(s.getClass());
	}
	public void CorrectPinAboveMin(){
		System.out.println("correct pin above min");
		s=ready;
		s.CorrectPinAboveMin();
		//System.out.println(s.getClass());
	}
	public void depositAboveMin(){
		s=ready;
		s.deposit();
		//System.out.println(s.getClass());
	}
	public void depositBelowMin(){
		s=overDrawn;
		s.deposit();
		//System.out.println(s.getClass());
	}
	public void withdrawBelowMin(){
		s=overDrawn;
		s.withdraw();
		//System.out.println(s.getClass());
	}
	public void withdrawAboveMin(){
		s=ready;
		s.withdraw();
		//System.out.println(s.getClass());
	}
	public void exit(){
		s.exit();
		s=idle;
		//System.out.println(s.getClass());
	}
	public void balance(){
		s.balance();
	}
	public void withdraw(){
		
	}
	public void lock(){
		s.lock();
	}
	public void unlock(){
		s.unlock();
	}
}
