import java.util.*;
public class MinandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array elements(10): ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }


        int maximum = 0, minimum = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i])
                maximum = arr[i];
            if (minimum > arr[i])
                minimum = arr[i];
        }


        System.out.println("Maximum: " + maximum + ", Minimum: " + minimum);

	}

}
