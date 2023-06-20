package BasicProgramsPackage;

public class Overriding
{
	public int  show (int a, int b)
	{
		return a+b;
	}
}
	 class Calculate extends Overriding 
{ 
	public int show (int a,int b)
	{
		return a+b+1;
	}

}
//	 class Demo
//{
////	//public static void main(String[] args) 
////	{
////		
////		Cal c = new Cal();
////		 int ref = c.show(3, 7);
////		 System.out.println(ref);
////		
////	}
////	
//}
