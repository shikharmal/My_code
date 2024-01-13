package retain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sik {

	public static void main(String[] args) {
		
		Employee a =new Employee("aa",12,1000);
		Employee b =new Employee("bb",11,5000);
		Employee c =new Employee("cc",15,500);
		
		List<Employee> g = Arrays.asList(a,b,c);
		               
		  
	List<Employee>incr =  g.stream()
		                    .map( e->{
		            	         if(e.getAge()>11)
		            	 {
		            		 e.setSalary(e.getSalary()*1.1);
		            	 }
		            	         return e;
		             })
		             .collect(Collectors.toList());
	
	System.out.println(incr);
	}
	

}
