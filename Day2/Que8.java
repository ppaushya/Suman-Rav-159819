package org.capgemini.com;

import java.util.Scanner;

public class Que8 {
	
	String str1="",str2="";
	char[] arr1=new char[str1.length()];
	char[] arr2=new char[str2.length()];	

	public void anagram(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		arr1=str1.toCharArray();
		arr2=str2.toCharArray();
		
		
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(arr1[i]==arr2[j]||arr1[i]==arr2[j]+32)
				{
					arr2[j]=' ';
					arr1[i]=' ';
				}
				
			}
		}
		for(int i=0;i<str1.length();i++)
		{
			if(arr1[i]==arr2[i])
			{
				System.out.println("Anagram");
				break;
			}
			else
			{
				System.out.println("Non Anagram");
				break;
			}

			
		}
		
	}
	
	public static void main(String[] args) {
	
		Que8 q=new Que8();
		Scanner s= new Scanner(System.in);
		System.out.println("enter string1");

		q.str1=s.nextLine();
		System.out.println("enter string2");

		q.str2=s.nextLine();
		q.anagram(q.str1,q.str2);
		s.close();

	}

}
