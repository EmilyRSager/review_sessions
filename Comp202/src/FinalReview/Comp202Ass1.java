package FinalReview;

import java.util.Arrays;
public class Comp202Ass1 {



		public static void main(String [] args)
		{
			int[] [] a = {{1,2,3},{4,5,6},{7,8,9}}; 
			System.out.println(Arrays.deepToString(subGrid(a, 1, 1, 2)));
		}
		public static int[][] subGrid(int [][]a, int i, int j, int m)
		{
			int [][] sub = new int [m][m]; 
			for (int x = 0; x <=m && i <a.length; x ++)
			{
				for (int y = 0; y<=m && j<a.length; y++)
				{
					sub[x][y] = a[i][j];
					j++;
				}
				i++;
			}
			return sub; 
		}
	}

