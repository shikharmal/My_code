package retain;

import java.util.Arrays;
import java.util.List;

public class Divide {
	
	public static  void main(String args[])
	{
		List<Integer> p =Arrays.asList(4,8,9,6,2);
		 
boolean q=	p.stream().
		.allMatch(a->a%2==0);
if (q)
{
	System.out.println("true");
}
else
{
		
		System.out.println("false");
	}
}
}
