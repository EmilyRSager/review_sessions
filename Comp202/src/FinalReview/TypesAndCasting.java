package FinalReview;

import java.util.ArrayList;

public class TypesAndCasting {

	public static void main(String[] args)
	{

		int myInt = 5; 
		double myDouble = 5.0; 
		fooDouble(myInt); //allowed--> fooDouble is expecting a double and receives an int
		fooInt(myInt); //obviously allowed
		fooDouble(myDouble);
		//fooInt(myDouble); //wont compile
	}
	public static void fooDouble(double x)
	{
		System.out.println(x);
	}

	public static void fooInt(int x)
	{
		System.out.println(x);
	}

	public static void Casting()
	{
		int x = 5; 
		double y = 5.3; 
		x = (int) 5.3; //need to explicitly cast to an int
		y = 5; //Cast happens automatically
	}


	public static void resize(int[] x) {
		x = new int[x.length * 2];
		System.out.print(x.length + " ");
	}
//	public static void main(String[] args) {
//		int[] x = {1,2};
//		resize(x);
//		System.out.println(x.length);
//	}


}
