package JavaOOP;

public class Student {
	
	public String name;
	public String id;
	
	//Access_modifier void/return_type methodName(parameters) 
	public void m1(int y, String z) //instance method
	{
		System.out.println("Mthod-1 is working " + y + " "+ z);
		
	}
	
	public void showDetailsOfStudent()
	{
		System.out.println(name + " " + id);
	}
	
	public void standUp()
	{
		System.out.println(name + " is now standing!");
	}

}
