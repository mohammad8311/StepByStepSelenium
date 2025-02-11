package JavaOOP;

public class C02JavaInstanceVariable {

	public static void main(String[] args) {
		
		C01JavaVariableClassCat c1 = new C01JavaVariableClassCat();
		c1.color = "White";
		
		C01JavaVariableClassCat c2 = new C01JavaVariableClassCat();
		c2.color = "Black";
		
		System.out.println("===========C1 Cat============");
		c1.details();
		
		System.out.println("===========C2 Cat============");
		c2.details();
		
		System.out.println("===========C1 Change============");
		c1.changeAction("jumping");
		c1.details();
		
		System.out.println("===========Int value print============");
		C01JavaVariableClassCat xVal = new C01JavaVariableClassCat();
		xVal.mt1();
		

	}

}
