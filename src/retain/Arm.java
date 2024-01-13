package retain;

public class Arm {

	public static void main(String[] args) {
		
		int a= 123; int sum =0; int t, q;
		 t=a;
		 
		while(t>0)
		{
			q=t%10;
			sum =sum + q*q*q;
			t=t/10;
		}
		
		if(sum == a)
		{
			System.out.println("Armstrong");
		}
		else 
		{
			System.out.println("NOT");
		}
		
		

	}

}
