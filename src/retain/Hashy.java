package retain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashy {

	public static void main(String[] args) {
		
	HashMap<String,Integer> p = new HashMap<>();
	        p.put ("abc",1);
	        p.put ("ac",2);
	        p.put ("ab",3);
	
	Iterator<Entry<String,Integer>> it = p.entrySet().iterator();
	    
	      while(it.hasNext())
	      {
	    	  Entry<String,Integer>	 g = it.next();
	    	  System.out.println(g.getKey());
	    	  System.out.println(g.getValue());
	}

}
}
