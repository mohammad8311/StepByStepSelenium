package BasicSeliniumJava;

public class D2BasicJavaString {

	public static void main(String[] args) {
		
		//String is an object //STring Literal
		//String s0 = "Mohammad Didarul Islam";
		//String s1 = "Mohammad Didarul Islam"; //The memory allocate same value doesn't create new value
		String s2 = "Hello";
		
		//new as a method there memory different allocation for same value
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		//Split the string
		String s = "Mohammad Didarul Islam";
		String[] splitteredString = s.split("Didarul");
		System.out.println(splitteredString[0]);
		System.out.println(splitteredString[1]);
		System.out.println(splitteredString[1].trim());
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("Reverse prinitng of array list: ");
		
		for(int i=s.length()-1; i<s.length(); i--)
		{
			System.out.println(s.charAt(i));
		}
		

	}

}
