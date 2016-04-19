package FinalReview;

public class BubbleSort {
	
	public static void main(String [] args)
	{
		int[] a = {7,5,9,21,13}; 
		BubbleSort.sort(a); 
	}
	
	public static void sort(int [] a)
	{
		int n = a.length; 
		boolean swapped = true; 
		while (swapped)
		{
			swapped = false; 
			System.out.println("scan");
			for(int i = 0; i < n-1; i++)
			{
				if (a[i] > a[i+1])
				{
					int temp = a[i]; 
					a[i] = a[i+1]; 
					a[i+1] = temp; 
					swapped = true; 
				}
			}
		}
	}

}
