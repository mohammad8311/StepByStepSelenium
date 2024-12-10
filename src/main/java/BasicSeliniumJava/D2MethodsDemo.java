package BasicSeliniumJava;

public class D2MethodsDemo {

	public static void main(String[] args) {
		
		D2MethodsDemo a = new D2MethodsDemo();
		String name = a.getData();
		System.out.println(name);
		getData2();
		
		D2MethodsDemo2 demoName = new D2MethodsDemo2();
		

	}
	
	public String getData()
	{
		System.out.println("Example method has been created!");
		return "By Mohammad Didarul Islam";
	}
	
	public static String getData2()
	{
		System.out.println("Example method for test");
		return "By Mohammad Didarul Islam";
	}
	

}
