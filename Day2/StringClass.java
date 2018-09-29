import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) {
		String str;
		Scanner scanner=new Scanner(System.in);	
		System.out.println("Enter the value of string:");
		str=scanner.next();
		for (int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
			 System.out.print(str.charAt(j));
			 System.out.print("\t");
			}
			System.out.println();

}
}}