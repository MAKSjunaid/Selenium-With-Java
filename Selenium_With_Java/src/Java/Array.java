package Java;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) 
	{
//		ARRAY - ONE WAY
		
		int[] arr = new int[5];

		arr[0] = 20;
		arr[1] = 44;
		arr[2] = 12;
		arr[3] = 47;
		arr[4] = 63;
		
		System.out.println(arr[1]);
		
//		ARRAY - SECOND WAY
		int[] arr2= {45,78,32,47,63};
		
		System.out.println(arr2[3]);
		
//		ARRAY LIST
		ArrayList<String> a=new ArrayList<String>();
		a.add("MA");
		a.add("Kalam");
		a.add("Sofi");
		
		System.out.println(a);
	}

}
