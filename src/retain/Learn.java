package retain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Learn {
	
	public static void main (String args[]) 
	{
		List<Integer> p =Arrays.asList(1,2,3,4,5,6,7);
		
		double q=p.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(q);
		
	}

}
