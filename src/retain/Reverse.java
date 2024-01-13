package retain;

public class Reverse {
	
	public static void main(String args[])
	{
  StringBuilder p= new StringBuilder("Hello");
  int front = 0;
  int back = p.length()-1;
  
  while(front>back)  
  { 
  char frontchar= p.charAt(front);
  char backchar =p.charAt(back);
  
      p.setCharAt(front, back);
	  p.setCharAt(back, front);
	  front ++;
	  back --;
  }
		  
  System.out.println(p);
  
}

}
