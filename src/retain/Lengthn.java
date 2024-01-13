package retain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lengthn {
	
	public static void main(String args[])
	{
		List<String> p = Arrays.asList("apple","banana","pear","guava");
		
		Map<Integer,List<String>> map = p.stream()
				                         .collect(Collectors.groupingBy(String:: length));
		System.out.print(map);
	}

}
