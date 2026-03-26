import java.util.Scanner;

// Compound Intrest \\
public class java02 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount = ");
        double principal = Scanner.nextDouble();

        System.out.print("Enter the amount of intrest rate( in %) = ");
        double rate = Scanner.nextDouble() / 100;

        System.out.print("Enter the time compound per year = ");
        int timecompound = Scanner.nextInt();

        System.out.print("Enter the year = ");
        int year = Scanner.nextInt();

        double amount;
        amount = principal * Math.pow(1 + rate / timecompound, timecompound * year);

        System.out.print("Your total amount = " + amount);

        Scanner.close();
    }

}
