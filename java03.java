import java.util.Scanner;

// Weight conversen program \\
public class java03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight conversen program :  ");
        System.out.println("1. Convet kg to lbs ");
        System.out.println("2. Convet lbs to kg ");
        System.out.print("Choose an option  = ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in kg = ");
            double weight = scanner.nextDouble();

            double newweight = weight * 2.20462;
            System.out.println("The converted weight is = " + newweight);
        } else if (choice == 2) {
            System.out.print("Enter weight in lbs = ");
            double weight = scanner.nextDouble();

            double newweight = weight * 0.453592;
            System.out.println("The converted weight is = " + newweight);
        }
        scanner.close();
    }
}