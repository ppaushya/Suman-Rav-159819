
public class PrimeNumber {
	

		public static void main(String[] args) {
			

			for(int num=1;num<=1000;num++)
			{
				int counter=0;
				for(int i=num;i>=1;i--)
				{
					if(num%i==0)
					{
						counter=counter+1;
					}
				}
				if(counter==2)
				{
					System.out.println(num);
				}
				
			}
				
				

		}}



		