package retain;

public class Stri {

	public static void main(String[] args) {
		
		String input ="aabbbc"; int l= input.length();  String s =" ";
		
		for(int i=0;i<l;i++)
		{
			int c=1;
			for(int j=i+1;j<l;j++)
			{
				if(input.charAt(i)== input.charAt(j))
				{
					c++;
				}
			}
				s= s + input.charAt(i) +c;
				
				i= i+c-1;
		}
		
		System.out.println(s);

	}

}
