package org.capgemini.com;

public class TestClass {

	public static void main(String[] args) {
		Pg_Student pg=new Pg_Student();
		pg.displayGrade();
		pg.attendance();
		if(pg.grade=='A' && pg.att_score==10)
		{
			System.out.println("Docterate");
			
		}else
			
			System.out.println("Better Luck next time:)");
		

		Ug_Student ug=new Ug_Student();
		ug.displayGrade();
		ug.attendance();
		if(ug.grade=='A' && ug.att_score==10)
		{
			System.out.println("Finally ur Engineering done");
		}
		else
			
				System.out.println("Better Luck next time:)");
			
			

	}

}
