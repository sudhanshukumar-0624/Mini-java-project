import java.util.Scanner;
public class java09{
    static  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double balance = 0 ;
        boolean isrunning = true;
        int choice;

        while(isrunning){

            System.out.println("**************");
            System.out.println("BANKIG PROGRAM");
            System.out.println("**************");
            
            System.out.println("1.Show balace amount");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("***************************");
            System.out.print("Enter your choice (1-4)= ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isrunning = false;
                default -> System.out.println("Enter the INVALID CHOICE ! ");

        
            }
        } 
        scanner.close();       
    }
    static void showbalance(double balance){
        System.out.println("*****************");
        System.out.printf("%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount = ");
        amount = scanner.nextDouble();
        if( amount < 0 ){
            System.out.println("Enter amount CANNOT BE NEGATIVE");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to withdraw = ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT AMOUNT");
            return 0;
        }
        else if(amount < 0){
            System.out.println("The amount CANNOT BE NEGATIVE !");
            return 0;
        }
        else{
            return amount;
        }
    }
}