package array;

import java.util.Scanner;

public class SumOfArrayElements {

	static int calcSubtotal(int nums[])
	{
		int sum = 0;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5]; // input--> arr ---> sum 
		
		System.out.println("Type ur values");
		for(int i=0;i<arr.length;i++) //getting input from user
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Your cart Sub total is "+ calcSubtotal(arr));
	}
	
	
	
	

}
