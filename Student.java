package org.cap.demo;

import java.util.Scanner;

public class Student
{

	
	String studentname;
	int mark1;
	int mark2;
	int mark3;
	public void getStudent()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Student name: ");
		studentname=scanner.next();
		
		System.out.println("Enter mark1: ");
		mark1=scanner.nextInt();
		
		System.out.println("Enter mark2: ");
		mark2=scanner.nextInt();
		
		System.out.println("Enter mark3: ");
		mark3=scanner.nextInt();
	}
		
		public int findScore()
		{
			return mark1+mark2+mark3;
		}
		
		
		
		public float findAverage()
		{
			return  (mark1+mark2+mark3)/3;
		}
		
		
	
	public void printStudent()
	{
		System.out.println( "\nStudent Name: " + studentname +
				         "\nmark1: " + mark1 +
						"\nmark2: " + mark2 +
						"\nmark3:" +  mark3+
						"\nTotal score:" + findScore() +
						"\nAverage marks:" + findAverage());
						
	}
	
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.getStudent();
		obj.printStudent();
	}
} 
 
	
	