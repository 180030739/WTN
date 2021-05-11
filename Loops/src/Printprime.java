import java.util.Arrays;
import java.util.Scanner;
public class Printprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,count=0;

		//print prime no between 1 to 100
		

		//loop for printing prime no between 1 to 100
		for(i=10;i<=99;i++)
		{
		for(j=1;j<=i;j++)
		{
		if(i%j==0)
		count++;
		}
		if(count==2)

		System.out.print(" "+i);
		count=0;
			
	}
}
}
