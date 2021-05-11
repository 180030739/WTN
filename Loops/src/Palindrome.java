import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int num,tNum,sum;
     
     Scanner bf=new Scanner(System.in);
     
     num= bf.nextInt();
   
     tNum=num;
     sum =0;
     while(tNum>0)
     {
         sum = (sum*10) + (tNum%10);
         tNum/=10;
     }
    
     if(num==sum)
         System.out.println(num + " is a Palindrome Number.");
     else
         System.out.println(num + " is not a Palindrome Number.");
	}

}
