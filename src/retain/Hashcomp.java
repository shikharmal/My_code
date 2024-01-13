package retain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Hashcomp {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(6, "Tushar");  
		hm.put(12, "Ashu");  
		hm.put(5, "Zoya");  
		hm.put(78, "Yash");  
		hm.put(10, "Praveen");  
		hm.put(67, "Boby");  
		hm.put(1, "Ritesh");
		
		System.out.println("Original map");
	   hm.forEach((k,v)->System.out.println(k+" "+v));
	   
	  
	   List<Map.Entry<Integer,String>> list = new ArrayList<>(hm.entrySet());
	   
	   Collections.sort(list, new Comparator<Entry<Integer, String>>()
	   {
           public int compare(Entry<Integer, String> entry1, Entry<Integer, String> entry2) {
               return entry1.getValue().compareTo(entry2.getValue());
           }
       });

       
       System.out.println("Sorted map");
       list.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
   }
	}
	
	
	
	


