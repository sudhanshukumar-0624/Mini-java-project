import java.util.Random;
import java.util.Scanner;

public class java13 {
    public static void main(String[]argn){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};    
        String player;
        String computer;
        String again = "yes";

        do{
        System.out.print("Enter your choice (rock/paper/scissors) = ");
        player = scanner.nextLine().toLowerCase();

        if(!player.equals("rock")&& 
            !player.equals("paper")&&
            !player.equals("scissors")){
            System.out.println("INVALID CHOICE !!!");
            continue;
        }        
        computer = choices[random.nextInt(3)];
        System.out.println("Computer choice = "+ computer);

        if(player.equals(computer)){
            System.out.println("IT A TIE !!!");
        }
        else if(player.equals("rock")&& computer.equals("scissors") || 
                player.equals("paper")&& computer.equals("rock") ||
                player.equals("scissors")&& computer.equals("paper")){
                    System.out.println("YOU WIN !!");
                }
        else{
            System.out.println("YOU LOSE !!!");
        }

        System.out.print("Want to play AGAIN ! (yes/no) = ");
        again = scanner.nextLine().toLowerCase();
        } while (again.equals("yes"));
        System.out.println("THANKU FOR PLAYING ");

        scanner.close();
    }
    
}
