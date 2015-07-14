
public class MakeDeposit {
	public void makeDeposit(){}
}

class make_deposit_int extends MakeDeposit{
	public void make_deposit_int(dataStore1 b1){
		b1.balance=b1.balance+b1.deposit;
	}
	public void make_deposit_int(dataStore3 b3){
		b3.balance=b3.balance+b3.deposit;
	}
}

class make_deposit_float extends MakeDeposit{
	public void make_deposit_float(dataStore2 b2){
		b2.balance=b2.balance+b2.deposit;
	}
}
