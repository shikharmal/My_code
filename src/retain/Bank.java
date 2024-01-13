package retain;

public class Bank extends Thread {
	
     static int  balance =5000;
	 static int  withdraw;

	 Bank(int withdraw) {
		
		Bank.withdraw = withdraw;	
	}
	
	 public static synchronized void show() { 
		
		 if(balance >= withdraw)
		 {
	  balance = balance - withdraw ;
	  System.out.println(" Balance left "+ balance);
	}
		 System.out.println("Insufficicient balance");
}
	 public void run() 
	 {
		Bank.show();
	 
}
}


