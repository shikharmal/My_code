package retain;

public class Rev {

	public static void main(String[] args) {
		
		String s = "Java Code", rev =" ",t=" ";  
		
		String [] p = s.split(" ");
		
		for(String word : p)
		{
			for(int i= word.length()-1;i>=0;i--)
			{
				t= t+ word.charAt(i);
			}
			
		}
		rev =rev  +t+" ";
		
	
	System.out.print(rev);
	
}
}
