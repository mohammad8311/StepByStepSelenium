package JavaOOP;

public class C05MyCalculator {
	
	public int add(int n1, int n2) {
		System.out.println("2 int value");
		return n1 + n2;
	}
	
	public int add(int n1, int n2, int n3) {
		System.out.println("3 int value");
		return n1 + n2 + n3;
	}
	
	public double add(double n1, int n2) {
		System.out.println("1 double value and 1 int value");
		return n1 + n2;
	}
	
	public double add(double n1, double n2) {
		System.out.println("two double type value");
		return n1 + n2;
	}
	
	public String add(String n1, String n2) {
		System.out.println("two string type value");
		return n1 + n2;
	}

}
