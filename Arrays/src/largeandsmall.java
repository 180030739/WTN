import java.util.Scanner;
import java.util.Arrays;
public class largeandsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest 2 numbers");
		System.out.println(arr[n-1]);
		System.out.println(arr[n-2]);
		System.out.println("Smallest two numbers");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		

	}

}
