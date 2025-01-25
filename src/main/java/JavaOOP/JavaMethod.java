package JavaOOP;

public class JavaMethod {

	public static void main(String[] args) {
		JavaMethodClass jmc1 = new JavaMethodClass();
		jmc1.window = 10;
		jmc1.door = 5;
		
		JavaMethodClass jmc2 = new JavaMethodClass();
		jmc2.window = 20;
		jmc2.door = 8;
		
		System.out.println("===========H1(jmc1)==========");
		jmc1.view();
		
		System.out.println("===========H2(jmc2)==========");
		jmc2.view();
		
		System.out.println("===========H1(jmc1)incr==========");
		jmc1.view();
		jmc2.increaseWindow(4);
		
		System.out.println("===========H2(jmc2)incr==========");
		jmc2.view();
		jmc1.increaseWindow(6);

	}

}
