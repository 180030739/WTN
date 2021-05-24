import java.util.*;
public class Remove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		
		String[] strs = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}