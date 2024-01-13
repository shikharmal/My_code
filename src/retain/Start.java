package retain;

import java.util.Arrays;
import java.util.List;

class Start
{
	public static void main(String args[])
	{
		
List<Integer> p= Arrays.asList(22,33,62,28);
                  
                 p.stream()
                 .map(s-> s+"")
                 .filter(s->s.startsWith("2"))
                 .forEach(System.out::println);
         
}
}