
public class storePin {	
	public void store_pin(){}
}
class store_pin_int extends storePin{
	public void store_pin(dataStore1 d1){
		d1.pin=d1.tempPin;
	}
	public void store_pin(dataStore2 d2){
		d2.pin=d2.tempPin;
	}
	public void store_pin(dataStore3 d3){
		d3.pin=d3.tempPin;
	}
}
class store_pin_string extends storePin{
	public void store_pin(dataStore1 d1){
		d1.pin=d1.tempPin;
	}
}