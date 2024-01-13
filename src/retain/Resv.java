package retain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Resv {
		    public static void main(String[] args)
		    {
	 HashMap<String,Integer> hm = new HashMap<>();
	 
	 hm.put("ABC", 1);
	 hm.put("AB", 2);
	 hm.put("AC", 3);
	 
	 List<Entry<String,Integer>> li = new ArrayList<>();
	 
	 Collections.sort(li, new Comparator<Entry<String,Integer>>()
	 {

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o1.getKey().compareTo(o2.getKey());
		}
		 
		 
	 });
	 
	 
	 Iterator<Entry<String,Integer>> it = hm.entrySet().iterator();
	 
	 while(it.hasNext())
	 {
	 Entry<String,Integer> entry = it.next();
	 
	 System.out.println(entry.getKey());
	 System.out.println(entry.getValue());
	 
		    	
		      
		    }
		
}
}

