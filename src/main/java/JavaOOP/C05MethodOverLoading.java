package JavaOOP;

public class C05MethodOverLoading {

	public static void main(String[] args) {
		
		C05MyCalculator cal = new C05MyCalculator();
		System.out.println(cal.add(4, 10));
		System.out.println(cal.add(4, 10, 15));
		System.out.println(cal.add(4.5, 10));
		System.out.println(cal.add(4.5, 10.7));
		System.out.println(cal.add("This is ", "test method."));

	}

}
