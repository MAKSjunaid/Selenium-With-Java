package Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("MA");
		a.add("Kalam");
		a.add("Sofi");
		
//		PRINT PERTICULAR ARRAY LIST
		System.out.println(a.get(1));
System.out.println("-------PRINT ALL ARRAY LIST DATA USING NORMAL FOR LOOP---------");	
	
//		PRINT ALL ARRAY LIST DATA USING NORMAL FOR LOOP
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
System.out.println("--------PRINT ALL ARRAY LIST DATA USING ENHANCED FOR LOOP--------");		
//		PRINT ALL ARRAY LIST DATA USING ENHANCED FOR LOOP
		for (String s: a)
		{
			System.out.println(s);
		}
System.out.println("----------------");	

System.out.println(a.contains("Kalam"));

System.out.println("-------CONVERT NORMAL ARRAY TO ARRAYLIST---------");

//     CONVERT NORMAL ARRAY TO ARRAYLIST
       String[] name = {"MA","Kalam","Sofi"};
       List<String> ConvertedArrayList = Arrays.asList(name);
       System.out.println(ConvertedArrayList.contains("Kalam"));



	}
}
