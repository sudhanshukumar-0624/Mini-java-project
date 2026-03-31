import java.util.Scanner;

// Name validator \\
public class java06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;

        System.out.print("Enter your name = ");
        name = scanner.nextLine();

        if (name.length() < 4 || name.length() > 12) {
            System.out.println("The name should be between 4-12 character ");
        } else if (name.contains(" ") || name.contains("_")) {
            System.out.print("Name should not contain any sace or underscore ");
        } else {
            System.out.println("Hello" + name);
        }

        scanner.close();
    }

}
