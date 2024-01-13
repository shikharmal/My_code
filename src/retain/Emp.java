package retain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
	
	public static void main (String args[])
	{
	
		Empget e1 = new Empget(1,500);
		Empget e2 = new Empget(2,5000);
		Empget e3 = new Empget(1,2000);
		
		List<Empget> p = Arrays.asList(e1,e2,e3);
		
		
		
	List<Empget> q=	 p.stream()
				
				 .sorted((a,b)-> (int)a.getSalary()-(int)b.getSalary()) 
				 .collect(Collectors.toList());
				          
                          System.out.println(q);
	
                      
		
				            
	

}
}
