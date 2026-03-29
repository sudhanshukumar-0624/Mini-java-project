import java.util.Scanner;

// Simple Calculator \\
public class java05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first numaber = ");
        double first = scanner.nextDouble();

        System.out.print("Select operation ( + , - , * , / , ^ ) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number = ");
        double second = scanner.nextDouble();

        double result = 0;
        switch (operator) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
            case '/' -> {
                if (second == 0) {

                    System.out.print("Cannot devisible by zero !");
                } else {
                    result = first / second;
                }
            }
            case '^' -> result = Math.pow(first, second);
        }
        System.out.print(result);

        scanner.close();
    }

}
