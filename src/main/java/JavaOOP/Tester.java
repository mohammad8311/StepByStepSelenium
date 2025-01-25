package JavaOOP;

public class Tester {
	public static void main(String[] args) {
		
		//Create Object: ClassName variable = new ClassName()
		Student s1 = new Student(); //object/instance1
		Student s2 = new Student(); //object/instance2
		Student s3 = new Student();
		Student s4 = new Student();
		
		s1.name = "Chrissy";
		s1.id = "1";
		s2.name = "Mary";
		s2.id = "6";
		s4.name = "Harry";
		s4.id = "20";
		
		//print using method
		s3.m1(10, "CSE");
		s1.showDetailsOfStudent();
		System.out.println("==========================" );
		s4.standUp();
		s2.standUp();
		s1.standUp();
		System.out.println("==========================" );
		
		//print the object's value
		System.out.println(s1.name +" "+ s1.id );
		System.out.println(s2.name +" "+ s2.id);
		s1 = s2;
		System.out.println(s1.name +" "+ s1.id );
		System.out.println(s2.name +" "+ s2.id);
		
		


	} 

}
