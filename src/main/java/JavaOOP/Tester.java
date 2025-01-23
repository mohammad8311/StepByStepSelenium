package JavaOOP;

public class Tester {
	public static void main(String[] args) {
		
		//Create Object: ClassName variable = new ClassName()
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "Chrissy";
		s1.id = "1";
		s2.name = "Mary";
		s2.id = "6";
		
		System.out.println(s1.name +" "+ s1.id );
		System.out.println(s2.name +" "+ s2.id);
		s1 = s2;
		System.out.println(s1.name +" "+ s1.id );
		System.out.println(s2.name +" "+ s2.id);


	}

}
