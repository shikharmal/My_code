package retain;

public class Evening implements Runnable {

	
	public void run()
	{
		for(int i= 1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even");
			}
		}
		
		
		
		
	}
	
	

}
