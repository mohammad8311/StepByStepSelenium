package JavaOOP;

public class C04DogClass {
	public String name;
	
	public void eat() {
		System.out.println(name + " is eating.");
	}
	
	public void eat(int fdn) {
		System.out.println(name + " is eating " + fdn);
	}
	
	public void eat(String fd) {
		System.out.println(name + " is eating " + fd);
	}
	
	public void eat(String fd, int qt) {
		System.out.println(name + " is eating " + qt + " " + fd);
	}
	
	public void eat(String fd, String fd2) {
		System.out.println(name + " is eating " + fd2 + " and " + fd);
	}
	
	public void bark() {
		System.out.println(name + " is barking.");
	}

}
