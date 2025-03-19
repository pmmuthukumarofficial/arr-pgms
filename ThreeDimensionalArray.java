package array;

import java.util.Scanner;

public class ThreeDimensionalArray {

	public static void main(String[] args) {

//		int[][][] arr = { 
//				{ 
//					{ 1, 2 },
//					{ 3, 4 } 
//				}, 
//				
//				{ 
//					{ 5, 6 },
//					{ 7, 8 } 
//				}
//				
//		    };
		
		int arr[][][]=new int[2][2][2];
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter ur arr values");
		for (int i = 0; i < 2; i++) {  

			for (int j = 0; j < 2; j++) {  

				for (int k = 0; k < 2; k++) {

					arr[i][j][k] = scan.nextInt();
				}				
			}			
		}

		for (int i = 0; i < 2; i++) {  // arr index

			for (int j = 0; j < 2; j++) { // row 

				for (int k = 0; k < 2; k++) { //col

					System.out.print(arr[i][j][k] + " ");
				}

				System.out.println();
			}
			System.out.println();
		}

	}
}
