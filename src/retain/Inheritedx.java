package retain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Inheritedx {
	
	public static void main(String args[]) 
	
	{
      HashMap<String,Integer> p= new HashMap<>();
      p.put(" acv", 1);
      p.put(" av", 2);
      p.put(" cv", 3);
      
    List<Entry<String,Integer>> list = new ArrayList<>(p.entrySet());
    
    Collections.sort(list, new Comparator<Entry<String,Integer>>()
    		{

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					
					return o1.getKey().compareTo(o2.getKey());
				}}
    );
    
    list.forEach(e->System.out.println(e.getKey()+ " "+ e.getValue()));		
    		
    
    		}
}


