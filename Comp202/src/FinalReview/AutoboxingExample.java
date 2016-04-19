package FinalReview;

import java.util.ArrayList;

public class AutoboxingExample {

	
	public static void main (String [] args) 
	{
		ArrayList <Integer> myArrayList = new ArrayList<Integer>();
		String y = "5"; 
		int x = Integer.parseInt(y); 
		myArrayList.add(1);
		exampleOne();
		
 	}
	
	public static void exampleOne(){
		ArrayList<Double> myList = new ArrayList<Double>();
		Double y = new Double(5);
		Double x = new Double(7);  
		myList.add(y); 
		myList.add(x); 
	
		myList.indexOf(x);
		myList.remove(3);
		

	}
}
