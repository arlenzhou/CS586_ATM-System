
public abstract class dataStore {
	private int b;//balance
	private int pin;//pin
	private int d;//deposit amount
	private int w;//withdrawn amount
	private int p;//penalty
	private int max;//max attempt
	private int min;//min balance
}

class dataStore1 extends dataStore{
	int tempDeposit=0;
	String tempPin=null;
	int tempBalance=0;
	int tempWithdrawn=0;
	int balance=-1;
	String pin=null;
	int deposit=0;
	int withdrawn=0;
	int penalty=10;
	int max=2;
	int min=1000;
}
class dataStore2 extends dataStore{
	float tempDeposit=0;
	int tempPin=0;
	float tempBalance=0;
	float tempWithdrawn=0;
	
	float balance=-1;
	int pin=0;
	float deposit=0;
	float withdrawn=0;
	float penalty=20;
	int max=1;
	float min=500;
}
class dataStore3 extends dataStore{
	int tempDeposit=0;
	int tempPin=0;
	int tempBalance=0;
	int tempWithdrawn=0;
	
	int balance=-1;
	int pin=0;
	int deposit=0;
	int withdrawn=0;
	int penalty=0;
	int max=1;
	int min=100;
}
