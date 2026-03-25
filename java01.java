import java.util.Scanner;
// Buy item from shop \\
public class java01{
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the item name = ");
        String item = scanner.nextLine();

        System.out.print("Enter the price = ");
        int price = scanner.nextInt();
        
        System.out.print("Enter the quantity = ");
        int quantity = scanner.nextInt();
        
        int Total = price*quantity;

        System.out.println("You have bought: " + item);

        System.out.println("The total amount of the item is : "+ Total);

        scanner.close();
    }
}