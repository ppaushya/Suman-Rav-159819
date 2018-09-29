import java.util.Scanner;

	public class Assignment4 {

	public static void main(String[] args) {
	char str[]= {'h','e','l','l','o'};
	
		Assignment4 obj = new Assignment4();
		//1.obj.primeFactors();
		//2.obj.alphabeticalOrder(str );
		//5.obj.ReverseOrder();
		obj.FirstFactorial();
	}
	public void primeFactors() {
		int number=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number:");
		 number=scan.nextInt();
		for(int i=2;i<=number;) {
			
			 if(number%i==0) {
				 System.out.println(i + " ");
				 number=number/i;
			 }
			 else
				 i++;
			 if(number==1) {
				 break;
			 }
			
		}
		
	}
		
		
	public void alphabeticalOrder(char[] str) {
		int len = str.length;
		char temp = 0;
		
		for(int i=0;i<len-1;i++) {
			for(int j=len-2;j>=i;j--) {
				if(str[j]>str[j+1]) {
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
									}
				
										}
			
							}
		System.out.println(str);
	}
	
	public void ReverseOrder() {
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter the string");
		 String strr =scan.nextLine();
		String reverse="";
		
		
		  for(int i = strr.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + strr.charAt(i);
	        }
		  System.out.println("reversed string:");
		  System.out.print(reverse);
	        
		
		}
	
	public void FirstFactorial() {
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter the number");
		int  num =scan.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		
		}
		System.out.println("fact  is:"+ fact);
	}
		
	}
	
	
