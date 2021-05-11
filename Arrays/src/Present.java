import java.util.Scanner;

public class Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
	        Scanner in = new Scanner(System.in);
	        int n=in.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	arr[i]=in.nextInt();
	        }
	        System.out.print("Enter a number to search: ");
	         int id = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == n) {
	                id = i;
	                break;
	            }
	        }

	        System.out.println("Element found at index: " + id);
	}

}
