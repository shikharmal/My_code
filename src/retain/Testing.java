package retain;

public class Testing {

	public static void main(String[] args) {
		
		Bank a = new Bank(1000);
		
		Thread obj1 = new Thread(a);
		Thread obj2 = new Thread(a);
		
		Bank b = new Bank(1000);
		Thread obj3 = new Thread(b);
		Thread obj4 = new Thread(b);
		
		obj1.start();
		obj2.start();
		
		obj3.start();
		obj4.start();
		

	}

}
