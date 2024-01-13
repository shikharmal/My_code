package retain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Getignore {
	public static void main(String args[])
	{
		List<Integer> p =Arrays.asList(44,55,66,33,88,741,2,3,5,6);
		
		List<Integer> q= p.stream().sorted().limit(5).collect(Collectors.toList());
		System.out.print(q);
				          
	}

}
