import java.util.Scanner;

public class java08 {
    
    public static void main(String[]argn)throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        int row;
        int colume;
        char symbol;

        System.out.print("Enter the no of rows = ");
        row = scanner.nextInt();

        System.out.print("enter the no of columes = ");
        colume = scanner.nextInt();

        System.out.print("Enter the symbol = ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i <= row ; i++){
            for(int j = 0; j <= colume; j++){
                System.out.print(symbol); 
                Thread.sleep(500);
            }
            System.out.println();
        }
        scanner.close();
    }
}
