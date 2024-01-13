package retain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Changes {

	public static void main(String[] args) {
		
		List<Integer> p = Arrays.asList(1,2,4,5,6,6);
		
		int a = p.stream()
				.sorted(Collections.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst()
				.get();
	  System.out.print(a);
	  
		

	}

}
