package org.capgemini.com;
import java.util.Scanner;
public class Ug_Student implements Student  {

	int marks;
	int days_attended;
	int att_score;
	char grade;
	Scanner scan =new Scanner(System.in);
	@Override
	public void displayGrade() {
  		
  		System.out.println("Enter marks of ug student ");
  	   marks=scan.nextInt();
  	 
  	   if(marks>=90)
  	   {
  		   grade='A'  ;	
  	   }
  	   else if(marks>=80&&marks<90)
  	   {
  		  grade='B' ;
  	   }
  	  else if(marks>=70&&marks<80)
 	   {
 		  grade='C' ;
 	   }
  	 else if(marks>=60&&marks<70)
	   {
		  grade='D' ;
	   }
  	 else
  		 System.out.println("Failed");
	}

	@Override
	public void attendance() {
		// TODO Auto-generated method stub
		System.out.println("Enter attendance in days per month for ug student ");
	  	   days_attended=scan.nextInt();
	  	   
	  	   if (days_attended==30)
	  	   {
	  		   System.out.println("Full attendence");
	  		   att_score=10;
	  	   }
	  	   else if(days_attended>15 && days_attended<30)
	  	   {
	  		   att_score=7;
	  	   }
	  	   else
	  		 att_score=4;
	}
	
}
