import java.util.Scanner;
public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num = 1, c, d;
	      Scanner in = new Scanner(System.in);
	      
	      n = in.nextInt();
	      
	      for ( c = 1 ; c <= n ; c++ )
	      {
	         for ( d = 1 ; d <= c ; d++ )
	           {
	              System.out.print("*");
	              
	           }
	          System.out.println();
	      }

	}

}
