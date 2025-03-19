package array;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int i,j;
		
//		int arr[][] = new int[][] {
//			{1, 2, 3},
//			{4, 5, 6},
//			{7, 8, 9}
//		} ;
		
		int arr[][] = new int[3][3];   // arr[0][0] -> indexing
		
		Scanner scan =new Scanner(System.in);
		
//		System.out.println("type ur values");
//		for(i=0;i<arr.length;i++) // i=2
//		{
//			for(j=0;j<arr.length;j++) // j=0
//			{
//				arr[i][j] = scan.nextInt(); // arr[2][0]
//			}			
//		}
//		
		
		for(i=0;i<arr.length;i++) // i=0
		{
			for(j=0;j<arr.length;j++) // j=0
			{
				
				System.out.print(arr[i][j]+" ");
			}			
			System.out.println();
		}
		
		
		
		
		
	}
}
