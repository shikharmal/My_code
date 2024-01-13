package retain;
import java.util.HashMap;

public class Hashee {

	public static void main(String[] args) {
		
		 String input ="aabbbc";int l= input.length();
		
		HashMap<Character,Integer> p= new HashMap<>();
		
		for(int i=0;i<l;i++)
		{
			
	        char ch = input.charAt(i);
			
			if(p.containsKey(ch))
			{
				int c = p.get(ch);
				c++;
				p.replace(ch, c);
			}
			else
			{
				p.put(ch, 1);
			}
		}
		
		for (Character key: p.keySet())
		{
		
		System.out.print(key+" "+p.get(key));
		

		}	
		}

}
