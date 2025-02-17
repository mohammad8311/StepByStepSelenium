package JavaOOP;

public class Day06Constructor {

	public static void main(String[] args) {
		//Constructor is a special method that is used to initialize object, it is called only once for an object.  
		//Every class must have constructor, it simply relies the default constructor. 
		//Two types of Constructor: Non-parameterized/default constructor and Parameterize constructor.
		//If we do not call any constructor Java called a default constructor
		
		Day06Student s1 = new Day06Student("Ariel", "12"); //object/instance1
		Day06Student s2 = new Day06Student("Subrina", "11"); //object/instance2
		Day06Student s3 = new Day06Student();
		Day06Student s4 = new Day06Student("Leonel", "10", 4.0);
		
		s1.showDetailsOfStudent();
		s2.showDetailsOfStudent();
		s3.showDetailsOfStudent();
		s4.showDetailsOfStudent();
	}

}
