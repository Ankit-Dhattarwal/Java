import java.util.Random;
//import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        // 0 For rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for the rock , 1 for the paper and 2 for the Scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if(userinput == computerinput){
            System.out.println("Match is draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput==1 && computerinput==0 || userinput== 2 && computerinput==1){
            System.out.println("Good , You win");

        }
        else{
            System.out.println("Computer uncle win");
        }
        if(computerinput==0){
            System.out.println("Computer uncle choice is : Rock "+computerinput);
        }
       else if(computerinput==1){
            System.out.println("Computer uncle choice is : Paper "+computerinput);
        }
        else if(computerinput==2){
            System.out.println("Computer uncle choice is : Scissor "+computerinput);
        }
    }
}
