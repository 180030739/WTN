import java.util.Scanner;

public class Patient {

    public static void main(String[] args) {
        BMICalc();
        BMICalcBonus1();
        BMICalcBonus1FeetInches();
    }

    public static void BMICalc() {
        Scanner sc = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Your height in m: ");
        height = sc.nextDouble();
        System.out.print("Your weight in kg: ");
        weight = sc.nextDouble();
        BMI = weight / (height * height);
        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }

    // For +10 bonus points, input their weight and height using pounds and inches, and convert to kilograms and meters
    // to figure the BMI.
    public static void BMICalcBonus1() {
        Scanner sc = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Your height in inches: ");
        height = sc.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = sc.nextDouble();
        BMI = weight * (703 / (height * height));
        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }

    // For an extra +3 bonus points (+13 total), input their height in feet and inches.
    public static void BMICalcBonus1FeetInches() {
        Scanner sc = new Scanner(System.in);
        double height, heightFeet, heightInches, weight, BMI;
        System.out.print("Your height (feet only): ");
        heightFeet = sc.nextDouble();
        System.out.print("Your height (inches): ");
        heightInches = sc.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = sc.nextDouble();
        height = heightFeet * 12 + heightInches;
        BMI = weight * (703 / (height * height));
        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }
}