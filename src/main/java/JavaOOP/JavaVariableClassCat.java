package JavaOOP;

public class JavaVariableClassCat {
	public String color; //instance var
	public String action = "sitting"; //instance  var
	int x = 10; //instance var
	
	public void changeAction(String action) { 
		this.action = action;		//the parameter action is working as local variable/inside the method 
	}
	
	public void mt1() {
		int x = 70; //local variable - when called inside the method
		System.out.println(x);
		System.out.println(this.x);
	}
	
	public void details() {		//instance method
		System.out.println(color + " cat is " + action);
	}

}
