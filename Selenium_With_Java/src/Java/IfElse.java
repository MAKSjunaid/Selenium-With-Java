package Java;

public class IfElse {

	public static void main(String[] args) 
	{
		int[] arr1= {2,4,5,6,7,8,9,10,13,25,521};
		
//		TO PRINT DIVIDED BY 2 USING IF ELSE
		
		for(int i=0; i<arr1.length; i++)
		{
			   if (arr1[i] % 2 ==0)
			    {
			     System.out.println(arr1[i]);
			    }
			   else
			    {
			     System.out.println(arr1[i]+ " is not multiple of 2");
			    }
		}
	}
}
