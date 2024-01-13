package retain;

public class Egd {
	
	public static void main (String args[])
	{
	int a[]= {1,4,3,2,68,6}; int temp ;
	
	for(int i = 0;i< a.length-1;i++)
	{
		int smallest = i;
		for(int j =i+1;j<a.length;j++)
		{
			 if(a[smallest]>a[j])
			 {
				smallest=j;  
			 }
			 
		}
			 temp = a[smallest];
			 a[smallest]=a[i];
			 a[i]=temp;
			 
}
		

	for (int i =0; i<a.length;i++)
	{
		System.out.print(a[i]);
	}
}
}
	
	