package JavaOOP;

public class JavaInstanceVariable {

	public static void main(String[] args) {
		
		JavaVariableClassCat c1 = new JavaVariableClassCat();
		c1.color = "White";
		
		JavaVariableClassCat c2 = new JavaVariableClassCat();
		c2.color = "Black";
		
		System.out.println("===========C1 Cat============");
		c1.details();
		
		System.out.println("===========C2 Cat============");
		c2.details();
		
		System.out.println("===========C1 Change============");
		c1.changeAction("jumping");
		c1.details();
		
		System.out.println("===========Int value print============");
		JavaVariableClassCat xVal = new JavaVariableClassCat();
		xVal.mt1();
		

	}

}
