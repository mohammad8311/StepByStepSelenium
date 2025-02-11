package JavaOOP;

public class C03JavaMethodsReturn {

	public static void main(String[] args) {
		
		C03MyCalculator c1 = new C03MyCalculator();
		
		//Case-1
		c1.add1(4, 5);
		
		System.out.println("=============");
		
		//case-2
		int ans = c1.add2(4, 8);
		System.out.println(ans);
		
		System.out.println("=============");
		
		//case-3
		System.out.println(c1.add2(6, 5));
		int r = 7 + c1.add2(4, 8);
		System.out.println(r);
		

	}

}
