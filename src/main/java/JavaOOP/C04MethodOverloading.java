package JavaOOP;

public class C04MethodOverloading {

	public static void main(String[] args) {
		
		C04DogClass c1 = new C04DogClass();
		
		c1.name = "Rover";
		c1.bark();
		
		c1.eat();
		c1.eat(8);
		c1.eat("Bread");
		c1.eat("Bread", 3);
		c1.eat("Bread", "meat");

	}

}
