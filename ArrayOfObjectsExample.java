package array;

import java.util.Scanner;

class Student
{
	int rollno;
	String name;
	
	public Student(int rollno, String name) {	
		this.rollno = rollno;
		this.name = name;
	}
	
	calcREsul
	
	void display()
	{
		System.out.println(rollno+"\t"+name);
	}
		
}


public class ArrayOfObjectsExample {

	public static void main(String[] args) {
		
		Student arr[] = new Student[10];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("type student count");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Rollno :");
			int roll = sc.nextInt();
			System.out.println("Name :");
			sc.nextLine();
			String name = sc.nextLine();
			
			arr[i] = new Student(roll, name);
		}
		
		for(int i=0;i<n;i++)
		{
			arr[i].display();
		}
		
	}

}
