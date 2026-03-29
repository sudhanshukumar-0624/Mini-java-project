import java.util.Scanner;

// Temperature conversen program \\
public class java04 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter temperature = ");
        double temp = Scanner.nextDouble();

        System.out.print("Convert Celcious or Feranhite (C or F) = ");
        String unit = Scanner.next().toUpperCase();

        double newtemp = (unit.equals("C")) ? ((temp - 32) * 5 / 9) : ((temp * 9 / 5) + 32);
        System.out.printf("%.1f°%s", newtemp, unit);

        Scanner.close();
    }
}