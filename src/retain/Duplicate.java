package retain;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;


public class Duplicate {
	
	public static void main (String args[])
			{
		int a[] = { 1,2,3,4,5};
		int[] b = { 1,2,5,6,6,7};
		
	List<Integer> g =	Arrays.stream(a)
			                  .filter(y->Arrays.stream(b).anyMatch(x->x==y))
			                  .boxed()
			                  .collect(Collectors.toList());
	
	System.out.println(g);
		
		
		
}
}	
