

public class Assignment1 {

	public static void main(String[] args) {
		
		int i=1,j,temp,k,count=0;
		
		while(i<=20)
		{
			temp=i+1;
			for(j=i;j<i+6 && j<=20;j=j+2)
			{
				System.out.print(j+" ");
				count++;
					
			}
			
			if(count!=3)
			{
				System.exit(0);
			}
			else
			{
				count=0;
			}
		
			i=j;
			for(k=temp;k<temp+6 && k<=20;k=k+2)
			{
				System.out.print(k+" ");
				count++;
			}
			if(count!=3)
			{
				System.exit(0);
			}
			else
			{
				count=0;
			}
		}

}
	
}

