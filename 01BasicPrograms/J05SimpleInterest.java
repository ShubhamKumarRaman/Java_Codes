import java.util.Scanner;

public class J05SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double principle, rate, time, SI, Amount;
        System.out.print("Enter Principle : ");
        principle = sc.nextDouble();
        System.out.print("Enter Rate : ");
        rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        time = sc.nextDouble();

        SI = (principle * rate * time) / 100;
        Amount = principle + SI;

        System.out.println("Simple Interest: " + SI);
        System.out.println("Amount      : " + Amount);
    }
}
