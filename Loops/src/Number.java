import java.util.*;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            if(n==0)
            {
            	System.out.println("ZERO");
            }
            else if(n>0)
            {
            	System.out.println("POSITIVE");
            }
            else
            {
            	System.out.println("NEGATIVE");
            }
	}

}
