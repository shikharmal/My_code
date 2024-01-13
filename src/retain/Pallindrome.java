package retain;

public class Pallindrome {

	public static void main(String[] args) {
		
		String s=" Ram is great ";
		int l=s.length(); String wrd =""; String rev =" ";
		for(int i= 0;i<l;i++)
		{
		char ch = s.charAt(i);
		if(ch !=' ')
		{
		wrd =wrd +ch;
		}
		else
		{
			rev =   wrd + rev+ " ";
			wrd =" ";
		}
		}
		rev = rev + wrd;
		System.out.println(rev);
		
		
		}
		

		
	}


