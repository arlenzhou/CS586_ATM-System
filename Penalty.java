
public class Penalty {
	
}
class Penalty_int extends Penalty{
	public void Penalty_int(dataStore1 b1){
		b1.balance=b1.balance-b1.penalty;
	}
	public void Penalty_int(dataStore3 b3){
		b3.balance=b3.balance-b3.penalty;
	}
}
class Penalty_float extends Penalty{
	public void Penalty_float(dataStore2 b2){
		b2.balance=b2.balance-b2.penalty;
	}
}