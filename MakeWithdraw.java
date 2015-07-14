
public class MakeWithdraw {
	public void MakeWithdraw(){}
}

class make_withdraw_int extends MakeDeposit{
	public void make_withdraw_int(dataStore1 b1){
		b1.balance=b1.balance-b1.withdrawn;
	}
	public void make_withdraw_int(dataStore3 b3){
		b3.balance=b3.balance-b3.withdrawn;
	}
}

class make_withdraw_float extends MakeDeposit{
	public void make_withdraw_float(dataStore2 b2){
		b2.balance=b2.balance-b2.withdrawn;
	}
}

