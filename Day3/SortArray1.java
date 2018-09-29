
public class SortArray1 {
	int arr[][]= {{1,2,3},{-1,1,5},{5,6,0}};

	public static void main(String[] args) {
		int rum[]= {1,3,4};
		SortArray1 obj =new SortArray1();
		obj.getSortArray(rum);
		
	}

	public void getSortArray(int[] rum) {

		int row=0;
		int column=0;

		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if(rum[i]==(rum[i]+1)) {
					System.out.println("No missing element");
				}
				else
					System.out.print((rum[i]+1));
					
	}
	
			
			
		}

	}




}
