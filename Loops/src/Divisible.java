import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0, n = 0;

        while(c < 5 ) {
            //if(n%2 == 0 && n%3 == 0 && n%5 == 0) or
            if(n%30 == 0) {
                System.out.print(n+ " ");
                c++;
            }
            n++;
        }
        System.out.println();   

	}

}
