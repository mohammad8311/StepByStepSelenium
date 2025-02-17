package JavaOOP;

public class Day06Student {
	public String name;
	public String id;
	public double cgpa;
	
	
	public Day06Student() {
		System.out.println("The constructor is printed without parameter!");

	}
	
	public Day06Student(String name, String id) {
		System.out.println("The constructor is printed with paratmeter!");
		this.name = name;
		this.id = id;
	}
	
	public Day06Student(String name, String id, double cgpa) {
		System.out.println("The constructor is printed with parameter!");
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}
	
	//Access_modifier void/return_type methodName(parameters) 
	public void m1(int y, String z) //instance method
	{
		System.out.println("Mthod-1 is working " + y + " "+ z);
		
	}
	
	public void showDetailsOfStudent()
	{
		System.out.println(name + " " + id + " " + cgpa);
	}
	
	public void standUp()
	{
		System.out.println(name + " is now standing!");
	}

}
