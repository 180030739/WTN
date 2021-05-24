import java.util.*;
public class Withx {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str =sc.next();
		
		if (str.charAt(0) == 'x')
			str = str.substring(1, str.length());
		
		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);
		
		System.out.println(str);

	}

}