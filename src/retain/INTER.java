package retain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class INTER {

	public static void main(String[] args) {
		
		List<Integer> p = Arrays.asList(1,4,6,8);
		
		List<Integer> q = p.stream()
				            .filter(a->a%2==0)
				           .sorted(Collections.reverseOrder())
				           .collect(Collectors.toList());
		
		System.out.println(q);
		 

	}

}
