package Java;

public class MethodsDemo {

	public static void main(String[] args) 
	{
		MethodsDemo d = new MethodsDemo();
		String name= d.GetSomeData();
		System.out.println(name);
		
// --------------CALLING FROM ANOTHER CLASS
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.GetUserData();
//--------------------------------------------
	}
	public String GetSomeData()
	{
		System.out.println("This is Kalam");
		return "At Home";
	}

}
