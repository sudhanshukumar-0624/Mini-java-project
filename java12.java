import java.util.Scanner;

public class java12 {
    public static void main(String[]args)throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        String[] question = {"1. what is 2 + 2 ? ",
                             "2. what is 2 - 2 ?",
                             "3. what is 5 * 5 ?",
                             "4. what is 5 * 0 ?",
                             "5. what is 5 / 5 ?"};

        String[][] options = {{"1. 0","2. 2","3. 4","4. 5"},
                              {"1. 0","2. 3","3. 8","4. 4"},
                              {"1. 10","2. 20","3. 25","4. 5"},
                              {"1. 10","2. 26","3. 44","4. 0"},
                              {"1. 30","2. 1","3. 46","4. 55"}};
        
        int[] answers = {3,1,3,4,2};
        int guess;
        int score = 0;

        System.out.println("*************************");
        System.out.println("Welcon to MATHS QUIZ !!!");
        System.out.println("*************************");

        for(int i = 0 ; i < question.length ; i++){
            System.out.println(question[i]);

            for(String option : options[i]){
                System.out.println(option);
            }
            Thread.sleep(1000);
            System.out.print("Enter the option = ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("**********");
                System.out.println("CORRECT !!");
                System.out.println("**********");
                score++;
            }
            else{
                System.out.println("**********");
                System.out.println(" WRONG !! ");
                System.out.println("**********");
            }
            System.out.println("The  correct answer is " + score +" out of "+question.length+".");
        }
        scanner.close();
    }   
}
