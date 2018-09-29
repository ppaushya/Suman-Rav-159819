
import java.util.Scanner;

public class CaptalizeString {

	char [] str1;
	String strg;
	String strg1;
	String strg2;
	



	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the string: ");
		  String s1=scan.nextLine();
		
		  System.out.println("This is the longest word in the sentence is:");
		


		CaptalizeString obj=new CaptalizeString();
		//obj.getCaps();
		//obj.getNext();
		obj.longestWord(s1);
		System.out.println(obj.longestWord(s1));
		
		
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
	}
	public void getNext() {
		int e;
		Scanner st=new Scanner(System.in);
		System.out.println("Enter input string");
		strg=new String();
		strg=st.nextLine();
		
		str1= strg.toCharArray();
		
		for(int i=0;i<str1.length;i++)
		{
		
				e=str1[i];
				if(e>96 && e<122)
					str1[i]=(char)(str1[i]+1);
				else if(e=='z')
							str1[i]='a';
				 if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u')
					
					 str1[i]=(char)(str1[i]-32);
				
				}
		


	
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]);
		}
		
	}
	public String longestWord(String str)
	{
	String s="",maxWord="";
	int maxlen=0,p=0;
	for(int i=0;i<str.length();i++)
	{

	if(str.charAt(i)!=' ')
	{
	s=s+str.charAt(i);
	}
	else
	{
	p=s.length();
	if((int) p>maxlen)
	{
	maxlen=p;
	maxWord=s;
	}
	s="";
	 
	}
	}
	 
	return maxWord;
	 
	}
	
	
	 
	}
		
	
	
	


