package BasicSeliniumJava;

public class D2JavaBasic {
	
	public static void main(String[] args) {
		
		int x = 28;
		String name = "Mohammad Didarul Alam";
		char y = 'a';
		double z = 5.12;
		boolean status = true;
		
		System.out.println("My name is " + x);
		
		//Arrays-
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 7; 
		
		int[] arr2 = {2, 4, 6, 8, 0, 80, 110};
		int sumTwoIndex = arr2[0] + arr2[1];
		
		System.out.println("Sum of index 0 and 1 = " + sumTwoIndex);
		
		// for loop - using for extract the array value || arr.length=5
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Extract the all value of Array: " + arr[i]);
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			
		}
		
		String[] fruitsName = {"Apple", "Mango", "Banana", "Orange"};
		
		for(int i=0; i<fruitsName.length; i++) {
			System.out.println(fruitsName[i]);
			
		}
		
		for(String s : fruitsName)
		{
			System.out.println(s);
		}
	}
		

}
