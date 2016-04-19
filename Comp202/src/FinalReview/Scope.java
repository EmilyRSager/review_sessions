package FinalReview;

public class Scope {
	
	public static void foo() 
	{
		for (int i = 0; i < 10; i++)
		{
			int y = 7; 
		}
	
		//System.out.println(y);
	}
	
	public static void main(String [] args)
	{
		//System.out.println(5.0 > 6 - 1.0 || !(5.0 != 5));
		//System.out.println(6 % 4 * 5 / 2);
//		TrickyExample2();
//		int x = 5; 
//		int y = 10; 
		//foo(x, y);
		//foo(x, y);
		TrickyExample3();
	}

	private static int foo(int x, int y) 
	{
		x = x + 10; 
		y = x; 
		System.out.println(y);
		return y; 
	}

	public static void TrickyExample(){
	int num = 4;
	 for (int i = num; i >= num / 3; i++) {
	 i = i - num;
	 System.out.println("Hello.");
	 //i++ happens at the end of every loop iteration! So i = 0 here, but it is incremented to 1 before the next loop runs! 
	 }
	}
	
	public static void TrickyExample2()
	{
		for(int i = 0; i < i * i; i++) {
			for(i = i * i; i < 5; i++) { 
			 System.out.println("*");
			}
		}
	}
	
	public static void TrickyExample3()
	{
		int a = 4;
		int b = a % 3;
		int c = (int)1.5 * a + b;
		System.out.println("The answer is: " + (b + c));
	}
}
