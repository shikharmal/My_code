package retain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emp2 {
	
	public static void main(String args[])
	{
	 Enitity a =new Enitity("ABC",1000,6.0);
	 Enitity b =new Enitity("AB",2000,5.0);
	 Enitity c =new Enitity("A",3000,4.0);
		
	List<Enitity> p =Arrays.asList(a,b,c);	
	
	  List<Enitity> g  = p.stream().filter(p->p.getSalary()>1000).collect(Collectors.toList());
	
    System.out.print(g);
		

}
}
