package BasicSeliniumJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D2BasicStatement {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 6, 7, 0, 77, 110, 225, 323, 779};
		
		//Print even number using if condition
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i] + " is even number");
			}
			else
			{
				System.out.println(arr[i] + " is odd number");
			}
		}
		
		//Using break
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i] + " is even number");
				break;
			}
			else
			{
				System.out.println(arr[i] + " is odd number");
			}
		}
		
		//Dynamic arrayList where doesn't bound length of index
		ArrayList<String> a = new ArrayList<String>();
		a.add("Jewel");
		a.add("Ashraf");
		a.add("Jahid");
		a.add("Jahangir");
		a.add("Shazzad");
		a.add("Wahid");
		a.remove(3);
		System.out.println(a.get(0));
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("**********************");
		
		for(String val : a)
		{
			System.out.println(val);
		}
		
		//Item present in arrayList
		System.out.println(a.contains("Jahid"));
		
		String[] fruitsName = {"Apple", "Mango", "Banana", "Orange"};
		List<String> NameArrays = Arrays.asList(fruitsName);
		System.out.println("Mango fruit is existed: " + NameArrays.contains("Mango"));
		System.out.println("Pineapple fruit is existed: " + NameArrays.contains("Pineapple"));
		

	}

}
