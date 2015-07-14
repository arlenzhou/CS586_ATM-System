
public class Operation{
	
	public void store_pin(){           //store pin done
		if(ATM.af.getClass()==concreteFactory1.class){
			store_pin_string sps=new store_pin_string();
			sps.store_pin(ATM_1.d1);
		}
		else if(ATM.af.getClass()==concreteFactory2.class){
			store_pin_int spi=new store_pin_int();
			spi.store_pin(ATM_2.d2);
		}
		else if(ATM.af.getClass()==concreteFactory3.class){		
			store_pin_int spi=new store_pin_int();
			spi.store_pin(ATM_3.d3);
		}
	}  
	public void store_balance(){       //store balance done
		if(ATM.af.getClass()==concreteFactory1.class){
			store_balance_int sbi=new store_balance_int();
			sbi.storeBalance(ATM_1.d1);
		}
		else if(ATM.af.getClass()==concreteFactory2.class){
			store_balance_float sbf=new store_balance_float();
			sbf.storeBalance(ATM_2.d2);
		}
		else if(ATM.af.getClass()==concreteFactory3.class){
			store_balance_int sbi=new store_balance_int();
			sbi.storeBalance(ATM_3.d3);
		}
	}  
	public void prompt_for_PIN(){//done
		System.out.println("please enter pin:");
	} // prompts to enter pin 
	public void display_menu(){
		if(ATM.af.getClass()==concreteFactory1.class){
			display_menu dm=new display_menu();
			dm.display_menu_1();
		}
		else if(ATM.af.getClass()==concreteFactory2.class){
			display_menu dm=new display_menu();
			dm.display_menu_2();
		}
		else if(ATM.af.getClass()==concreteFactory3.class){
			display_menu dm=new display_menu();
			dm.display_menu_3();
		}
		System.out.println("1.card 2.pin 3.deposit 4.withdraw 5.balance 6.exit 7.lock 8.unlock");
	} // display a menu with a list of transactions 
	public void incorrect_pin_msg(){} // displays incorrect pin message 
	public void too_many_attempts_msg(){} // display too many attempts message 
	public void MakeDeposit(){
		if(ATM.af.getClass()==concreteFactory1.class){
			if(MDA.s.getClass()==ready.class){
				make_deposit_int mdi=new make_deposit_int();
				mdi.make_deposit_int(ATM_1.d1);
			}
			if((MDA.s.getClass()==overDrawn.class)&&(ATM_1.d1.balance+ATM_1.d1.deposit<ATM_1.d1.min)){
				make_deposit_int mdi=new make_deposit_int();
				Penalty_int pi=new Penalty_int();
				mdi.make_deposit_int(ATM_1.d1);
				pi.Penalty_int(ATM_1.d1);
				
				//ATM_1.d1.balance=ATM_1.d1.balance+ATM_1.d1.deposit-ATM_1.d1.penalty;
			}
		}
		
		else if(ATM.af.getClass()==concreteFactory2.class){
			if(MDA.s.getClass()==ready.class){
				make_deposit_float mdf=new make_deposit_float();
				mdf.make_deposit_float(ATM_2.d2);
				//ATM_2.d2.balance=ATM_2.d2.balance+ATM_2.d2.deposit;
			}
			if((MDA.s.getClass()==overDrawn.class)&&(ATM_2.d2.balance+ATM_2.d2.deposit<ATM_2.d2.min)){
				make_deposit_float mdf=new make_deposit_float();
				Penalty_float pf=new Penalty_float();
				mdf.make_deposit_float(ATM_2.d2);
				pf.Penalty_float(ATM_2.d2);
				
				//ATM_2.d2.balance=ATM_2.d2.balance+ATM_2.d2.deposit-ATM_2.d2.penalty;
			}
		}
		else if(ATM.af.getClass()==concreteFactory3.class){
			if(MDA.s.getClass()==ready.class){
				make_deposit_int mdi=new make_deposit_int();
				mdi.make_deposit_int(ATM_3.d3);
				//ATM_3.d3.balance=ATM_3.d3.balance+ATM_3.d3.deposit;
			}
			if((MDA.s.getClass()==overDrawn.class)&&(ATM_3.d3.balance+ATM_3.d3.deposit<ATM_3.d3.min)){
				make_deposit_int mdi=new make_deposit_int();
				Penalty_int pi=new Penalty_int();
				mdi.make_deposit_int(ATM_3.d3);
				pi.Penalty_int(ATM_3.d3);
				//ATM_3.d3.balance=ATM_3.d3.balance+ATM_3.d3.deposit-ATM_3.d3.penalty;
			}
		}
	}// makes deposit (increases balance by a value stored in temp. data store) 
	public void MakeWithdraw(){
		if(ATM.af.getClass()==concreteFactory1.class){
			if(MDA.s.getClass()==ready.class){
				make_withdraw_int mwi=new make_withdraw_int();
				mwi.make_withdraw_int(ATM_1.d1);
				//ATM_1.d1.balance=ATM_1.d1.balance-ATM_1.d1.withdrawn;
				}
			if(MDA.s.getClass()==overDrawn.class){
				make_withdraw_int mwi=new make_withdraw_int();
				Penalty_int pi=new Penalty_int();
				mwi.make_withdraw_int(ATM_1.d1);
				pi.Penalty_int(ATM_1.d1);
				
				//ATM_1.d1.balance=ATM_1.d1.balance-ATM_1.d1.withdrawn-ATM_1.d1.penalty;
			}
		}
		else if(ATM.af.getClass()==concreteFactory2.class){
			if(MDA.s.getClass()==ready.class){
				make_withdraw_float mwf=new make_withdraw_float();
				mwf.make_withdraw_float(ATM_2.d2);
				//ATM_2.d2.balance=ATM_2.d2.balance-ATM_2.d2.withdrawn;
				}
			if(MDA.s.getClass()==overDrawn.class){
				make_withdraw_float mwf=new make_withdraw_float();
				Penalty_float pf=new Penalty_float();
				mwf.make_withdraw_float(ATM_2.d2);
				pf.Penalty_float(ATM_2.d2);
				//ATM_2.d2.balance=ATM_2.d2.balance-ATM_2.d2.withdrawn-ATM_2.d2.penalty;
			}
		}
		else if(ATM.af.getClass()==concreteFactory3.class){
			if(MDA.s.getClass()==ready.class){
				make_withdraw_int mwi=new make_withdraw_int();
				mwi.make_withdraw_int(ATM_3.d3);
				//ATM_3.d3.balance=ATM_3.d3.balance-ATM_3.d3.withdrawn;
				}
			if(MDA.s.getClass()==overDrawn.class){
				make_withdraw_int mwi=new make_withdraw_int();
				Penalty_int pi=new Penalty_int();
				mwi.make_withdraw_int(ATM_3.d3);
				pi.Penalty_int(ATM_3.d3);
				//ATM_3.d3.balance=ATM_3.d3.balance-ATM_3.d3.withdrawn-ATM_3.d3.penalty;
			}
		}
	} // makes withdraw (decreases balance by a value stored in temp. data store) 
	public void Penalty(){//done
		if(ATM.af.getClass()==concreteFactory1.class){
			Penalty_int pi=new Penalty_int();
			pi.Penalty_int(ATM_1.d1);
		}
		else if(ATM.af.getClass()==concreteFactory2.class){
			Penalty_float pf=new Penalty_float();
			pf.Penalty_float(ATM_2.d2);
		}
		else if(ATM.af.getClass()==concreteFactory3.class){
			Penalty_int pi=new Penalty_int();
			pi.Penalty_int(ATM_3.d3);
		}
	}	// applies penalty (decreases balance by the amount of penalty) 
	public void eject_card(){//done
		System.exit(1);
	}// ejects the card 
	public void DisplayBalance(){
		if((ATM.af.getClass()==concreteFactory1.class)&&((MDA.s.getClass()==ready.class)||MDA.s.getClass()==overDrawn.class)){
			System.out.println(ATM_1.d1.balance);
		}
		else if(ATM.af.getClass()==concreteFactory2.class&&((MDA.s.getClass()==ready.class)||MDA.s.getClass()==overDrawn.class)){
			System.out.println(ATM_2.d2.balance);
		}
		else if(ATM.af.getClass()==concreteFactory3.class&&((MDA.s.getClass()==ready.class)||MDA.s.getClass()==overDrawn.class)){
			System.out.println(ATM_3.d3.balance);
		}
	} // displays the current value of the balance 
	public void lock(){//done
		if(((ATM.af.getClass()==concreteFactory1.class)||(ATM.af.getClass()==concreteFactory2.class)||(ATM.af.getClass()==concreteFactory3.class))&&((MDA.s.getClass()==ready.class)||MDA.s.getClass()==overDrawn.class)){
		lock l=new lock();
		l.lock();}
	}
	public void unlock(){//done
		if(((ATM.af.getClass()==concreteFactory1.class)||(ATM.af.getClass()==concreteFactory2.class)||(ATM.af.getClass()==concreteFactory3.class))&&((MDA.s.getClass()==ready.class)||MDA.s.getClass()==overDrawn.class)){
		unlock ul=new unlock();
		ul.unlock();}
	}
	public void initialize(abstractFactory af){
		//sp=af.getStore_pin();
		//sb=af.getStore_balance();
	}
}




