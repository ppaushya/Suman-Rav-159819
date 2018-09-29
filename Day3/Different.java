import java.util.Scanner;

public class Different {

	int[][] arr;
	int row;
	int column;
	

	public static void main(String[] args) {
		
		 Different obj=new Different();
		 obj.getDiagonal() ;
		 obj.printMatrix();
		 //obj.UpperDia();
		 //obj.LowerDia();
		 //obj.Transpose();
	}
	
	public void getDiagonal() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input total row : ");
		 row = scan.nextInt();
		 System.out.print("Input total column : ");
		 column = scan.nextInt();
		 arr = new int[row][column];
		 for(int i=0;i<row;i++) {
	    	   for(int j=0;j<column;j++) {
	    		   arr[i][j] = scan.nextInt(); 
	    	   }
	    }
	}
	public void printMatrix() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println(" ");
		}
	}
	public void LowerDia() {
		int num=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(arr[i][j] + " ");
				num++;
				
			}
			System.out.println();
		}
	}
	public void UpperDia() {
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				if(i<=j) {
					System.out.print(arr[i][j] + " ");
					
				}
				else
					System.out.print("  ");
				
				
			}
			System.out.println();
		}
	}
	public void Transpose() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[j][i] + " ");
				
			}
			System.out.println();
		}
	}
	
}
