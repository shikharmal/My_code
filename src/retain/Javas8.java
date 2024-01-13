package retain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Javas8 {

	public static void main(String[] args) {
		
		String input= "welcome to code decode and code code decode welcome you";
		
		String s[] = input.split(" ");
		List<String> p = new ArrayList<>();
		
		for(int i =0;i< s.length;i++)
		{
			p.add(s[i]);
		}
		
		Map<String, Long> g = p.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(g);
		

	}

}
