import java.util.*;
public class removedupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                }
            }
            if (flag) {
                for (int j = i; j < n-1; j++) {
                    arr[i] = arr[i+1];
                }
                n--;
            }
        }

        //printing array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

	}

}
