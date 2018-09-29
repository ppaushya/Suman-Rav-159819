
import java.util.Scanner;

public class CaptalizeString {

	char [] str1;
	String strg;




	public static void main(String[] args) {


		CaptalizeString obj=new CaptalizeString();
		obj.getCaps();

	}
	public void getCaps() {
		int length;
		Scanner st=new Scanner(System.in);
		strg=new String();
		strg=st.nextLine();
		
		str1= strg.toCharArray();
		
		str1[0]=(char)(str1[0]-32);
		for(int i=1;i<str1.length;i++)
		{
			if(str1[i-1]==' ') {


				str1[i]=(char)(str1[i]-32);


			}


	}
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]);
		}
	}}
