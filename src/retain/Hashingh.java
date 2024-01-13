package retain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Hashingh {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(6, "Tushar");  
		hm.put(12, "Ashu");  
		hm.put(5, "Zoya");  
		hm.put(78, "Yash");  
		hm.put(10, "Praveen");  
		hm.put(67, "Boby");  
		hm.put(1, "Ritesh");
		
		Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry =it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		List<Entry<Integer,String>> p = new ArrayList<>(hm.entrySet());
	    
		Collections.sort(p, new Comparator<Entry<Integer,String>>()
				{
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
				
				});
		
		p.forEach(e->System.out.println(e.getValue()+" "+ e.getKey()));
	}
}

	


