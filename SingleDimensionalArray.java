package array;

import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
//		non-primitive variable -> new 
		
		int num1=10, num2, num3; // TY101    JK900  
		num2=num1;
		
//		int arr[]=new int[] {12, 20, 30, 40, 50};
		
		Scanner scan=new Scanner(System.in);
		
		
		int arr[]=new int[10];  /// it allocats continous memory address AX10 AX11 AX12............
		
		// indexing  -> [0] starts with zero (n-1)
		
		System.out.println("type ur values one by one");
		for(int i=0;i<5; i++)   /// property
		{
			arr[i] = scan.nextInt();
		}
		
		
		for(int i=0;i<arr.length; i++)   /// property
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("end");
		
//		System.out.println(arr);
		
	}

}
