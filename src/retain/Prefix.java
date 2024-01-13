package retain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prefix {
	
	public static void main (String args[])
	{
	
	List<Integer> p= Arrays.asList(1,3,30,20,40,40,80);
	
	List<Integer> q= p.stream()
			          .map(e->String.valueOf(e))
			          .filter(e->e.startsWith("2"))
			          .map(Integer::valueOf)
			          .collect(Collectors.toList());
	System.out.print(q);

}
}
