package org.capgemini.com;
import java.util.Scanner;
public interface Interface1 {

	 int num=200;
	 default int getElement()
	 {
		 Scanner scan=new Scanner(System.in);
		// num=scan.nextInt();
		 System.out.println("Enetr two numbers");
		 int anum=scan.nextInt();
		 int bnum=scan.nextInt();
		 return anum+bnum;
		 
		 
	 }
	default void printElement()
	{
		//int res=getElement();
		System.out.println("Final variable num value is costatnt"+num);
	}
}
