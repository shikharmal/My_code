package retain;

public class Test {

	public static void main(String[] args) {
		Even t = new Even();
		Thread obj = new Thread(t);
		obj.start();

	}

}
