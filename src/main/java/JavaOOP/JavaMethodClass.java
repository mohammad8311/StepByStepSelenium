package JavaOOP;

public class JavaMethodClass {
	public int window; //instance variable
	public int door;	//instance variable
	
	public void increaseWindow(int dr)
	{
		door = door + dr;
	}
	
	public void view() //instance method
	{
		System.out.println(window + " Windows");
		System.out.println(door + " Doors");
	}

}
