package retain;

public class Threading {

	public static void main(String[] args) {
		
		Evening a = new Evening();
		Thread obj1 = new Thread(a);
		Oddening b= new Oddening();
		Thread obj2 = new Thread(b);
		obj1.start();
		obj2.start();

	}

}
