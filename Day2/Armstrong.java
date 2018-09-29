import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int a;
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of num:");
        num=scanner.nextInt();
        int temp=num;
        while(num>0)
        {
        	a=num%10;
        	sum=sum+(a*a*a);
        	num=num/10;
        }
        if(temp==sum)
        	System.out.println("Number is Armstrong");
        else
        	System.out.println("Number is not  Armstrong");
        	
        	
        
	}

}
