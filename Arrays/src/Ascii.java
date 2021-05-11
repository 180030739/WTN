import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ascii[] = new int[n];
        for (int i = 0; i < ascii.length; i++) 
        {
        	ascii[i]=sc.nextInt();
            System.out.print((char)ascii[i] + " ");
        }
        System.out.println();

	}

}
