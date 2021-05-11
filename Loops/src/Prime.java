import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			break;
		}
		
		if(count==2)
		{
			System.out.println("Prime Number");
		
			
		}
		else
		{
			System.out.println("Not Prime Number");
			
		}
	}
}
