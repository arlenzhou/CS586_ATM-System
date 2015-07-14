
public class storeBalance {
	public void storeBalance(){}
}
class store_balance_int extends storeBalance{
	public void storeBalance(dataStore1 b1){
		b1.balance=b1.tempBalance;
	}
	public void storeBalance(dataStore3 b3){
		b3.balance=b3.tempBalance;
	}
}
class store_balance_float extends storeBalance{
	public void storeBalance(dataStore2 b2){
		b2.balance=b2.tempBalance;
	}
}