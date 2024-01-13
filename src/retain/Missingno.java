package retain;

public class Missingno {

	public static void main(String[] args) {
		
		
		int[] arr1={7,5,6,1,4,2};
		
		int n= arr1.length +1, t = 0 ,m;
		
		int sum = n*(n+1)/2;
		
		for(int i=0;i<arr1.length;i++)
		{
			t = t+arr1[i]; 
		}
		
		 m = sum - t;
		 
	System.out.println(m);		            

	

}
}