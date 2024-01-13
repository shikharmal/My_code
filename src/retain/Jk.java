package retain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Jk {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(6, "Tushar");  
		hm.put(12, "Ashu");  
		hm.put(5, "Zoya");  
		hm.put(78, "Yash");  
		hm.put(10, "Praveen");  
		hm.put(67, "Boby");  
		hm.put(1, "Ritesh");
		
		List<Map.Entry<Integer,String>> list = new ArrayList<>();
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>()
				{

					@Override
					public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
						
						return o1.getValue().compareTo(o2.getValue());
					}
				
				
				
				
				});
				
	}
}
		
		
		
		
		

		
		



