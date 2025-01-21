package JavaOOP;

public class Tester {
	public static void main(String[] args) {
		
		//Create Object: ClassName variable = new ClassName()
		Student s1 = new Student();
		Student s2 = new Student();
		
		int  x = 5;
		s1.name = "Example Name";
		s2.id = "1";
		
		System.out.println(s1.name);
		System.out.println(s2.id);
		System.out.println(x);
	}

}
