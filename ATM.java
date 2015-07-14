import java.util.Scanner;
public class ATM {
		//public static int ATM_num=0;
	public static abstractFactory af;
	public static void main(String args[]){	
		//public static int ATM_num=0;
		String num=null;
		out("           CS586 Project\r\n"+"                   --Jie Zhou A20307609 jzhou49@hawk.iit.edu 312 647 4538");
		out("1:ATM_1\r\n"+"2:ATM_2\r\n"+"3:ATM_3\r\n"+"Welcome to ATM system, please select ATM:");
		while(true){
		num= in();
		if(num.equals("1")){
			ATM_1 A1=new ATM_1();
			break;
		}
		else if(num.equals("2")){
			ATM_2 A2=new ATM_2();
			break;
		}
		else if(num.equals("3")){
			ATM_3 A3=new ATM_3();
			break;
		}
		else{
			out("select error");
		}
		}
	}

	public static void out(String out){
		System.out.println(out);
	}
	
	public static String in(){
		Scanner in=new Scanner(System.in);
		String num = in.nextLine();
		return num;
	}
} 



