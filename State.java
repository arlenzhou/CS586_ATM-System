
public class State {
	public void create(){
		
	}
	public void card(){
		idle i=new idle();
		i.card();
	}
	public void IncorectPin(int max){}
	public void CorrectPinBelowMin(){}
	public void CorrectPinAboveMin(){}
	public void deposit(){
		ready r=new ready();
		r.deposit();
	}
	public void BelowMinBalance(){}
	public void AboveMinBalance(){}
	public void exit(){
		ready r=new ready();
		r.exit();
	}
	public void balance(){
		ready r=new ready();
		r.balance();
	}
	public void withdraw(){
		ready r=new ready();
		r.withdraw();
	}
	public void lock(){
		ready r=new ready();
		r.lock();
	}
	public void unlock(){
		ready r=new ready();
		r.unlock();
	}	
}

class idle extends State{
	Operation op=new Operation();
	public void card(){
		op.store_balance();
		op.store_pin();
	}
}
class checkPin extends State{
	Operation op=new Operation();
	public void deposit(){
		op.MakeDeposit();
	}
}
class ready extends State{
	Operation op=new Operation();
	public void balance(){
		op.DisplayBalance();
		}
	public void deposit(){
		op.MakeDeposit();
	}
	public void exit(){
		op.eject_card();
	}
	public void withdraw(){
		op.MakeWithdraw();
	}
	public void penalty(){
		op.Penalty();
	}
	public void lock(){
		op.lock();
	}
	public void unlock(){
		op.unlock();
	}
}
class overDrawn extends State{
	Operation op=new Operation();
	public void balance(){
		op.DisplayBalance();
		}
	public void deposit(){
		op.MakeDeposit();
	}
	public void exit(){
		op.eject_card();
	}
	public void penalty(){
		op.Penalty();
	}
	public void lock(){
		op.lock();
	}
	public void unlock(){
		op.unlock();
	}
}
class locked extends State{
	Operation op=new Operation();
	public void unlock(){
		op.unlock();
	}
}

 