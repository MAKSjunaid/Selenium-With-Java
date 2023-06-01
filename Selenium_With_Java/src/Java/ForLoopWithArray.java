package Java;


public class ForLoopWithArray {

	public static void main(String[] args) 
	{
//		INT DECLARED ARRAY
//		            0  1  2   3  4
		int[] arr= {45,78,32,47,63};
		
//		INT LOOP
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
//		STRING ARRAY
		String[] name= {"MA", "Kalam", "Sofi"};
		
//		STRING LOOP
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
//		                                             ENHANCED FOR LOOP
		                                             for (String s:  name)
		                                             {
			                                          System.out.println(s);
	                                                 }

	}

}
