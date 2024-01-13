package retain;

public class Jingles {
	
	public static void sum(int a)
	{
      for(int i=1;i<=a;i++)			
      {
    	  if(i%3==0 && i%5==0)
    	  {
    		  System.out.println("jk");
    	  }
    	  else if(i%3==0)
    	  {
    		  System.out.println("just jk");
    	  }
    	  else
    	  {
    		  System.out.println("no");
    	  }
      }
		
	}
	
	public static void main (String args[])
	{
		
		sum(15);
	}

}
