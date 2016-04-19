package FinalReview;

public class BinarySearch {

	
	public static void main(String [] args)
	{
		
		int [] x = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		BinarySearchAlgorithm(x, 0, 15, -10);
	}
	
	public static int BinarySearchAlgorithm(int [] array, int minIndex, int maxIndex, int target)
	{
		int iterationCount =0; 
		while (maxIndex>minIndex)
		{
			int midpoint = (maxIndex+minIndex)/2; 
			
			if (array[midpoint] == target )
			{
				return midpoint; 
			}
			else if (array[midpoint] < target)  //search the upper half of the array
			{
				minIndex = midpoint + 1; 
			}
			else //search the lower half of the array
			{
				maxIndex = midpoint - 1; 
			}
			iterationCount++; 
		}
		System.out.println(iterationCount);
		return -1; 
	}
}
