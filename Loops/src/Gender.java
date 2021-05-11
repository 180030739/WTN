import java.util.*;
public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 2) {
            String gender = args[0];
            int ages = Integer.parseInt(args[1]);

            if(gender.equals("Male") || gender.equals("male")) {
                if(ages >= 1 && ages <= 60)
                    System.out.println("Interest == 9.2%");
                else if(ages >= 61 && ages <= 120)
                    System.out.println("Interest == 8.3%");
                else 
                    System.out.println("You are too young or too old to exist.");
            }
            else if(gender.equals("Female") || gender.equals("female")) {
                if(ages >= 1 && ages <= 58)
                    System.out.println("Interest == 8.2%");
                else if(ages >= 59 && ages <= 120)
                    System.out.println("Interest == 7.6%");
                else 
                    System.out.println("You are too young or too old to exist.");
            }
        }
        else
            System.out.println("usage: java Solution gender age");

	}

}
