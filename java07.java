import java.util.Random;
import java.util.Scanner;

// Guess the number game \\
public class java07 {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempt = 0;
        int min = 1;
        int max = 10;
        int randomnummber;

        randomnummber = random.nextInt(min, max);

        System.out.printf("Enter the no between %d-%d\n", min, max);

        do {
            System.out.print("Enter the no = ");
            guess = scanner.nextInt();
            attempt++;

            if (guess < randomnummber) {
                System.out.print("TO LOW!, TRY AGAIN \n");
            } else if (guess > randomnummber) {
                System.out.print("TO HIGH!, TRY AGAIN \n");
            } else {
                System.out.println("You won the game " + randomnummber);
                System.out.println(" No of attempt " + attempt);
            }

        } while (guess != randomnummber);

        scanner.close();
    }

}
