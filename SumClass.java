import java.util.Scanner;
public class SumClass {
public static void main(String[] args) {
int m;
int sum=0;
         Scanner scanner=new Scanner(System.in);
		 System.out.print("enter the number:");
		 m=scanner.nextInt();
while(m>0)
{
	sum=sum+m%10;;
	m=m/10;
	}
  System.out.print("Sum of Digits:"+sum);
	
}
}