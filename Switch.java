import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 25:
                System.out.println("You are able to join army");
                break;
            case 60:
                System.out.println("You are going to get retried");
                break;
            default:
                System.out.println("Enjoying your life");
        }
        System.out.println("Thanks for join my java code");
    }
}


















//        if(age>50){
//            System.out.println("You are experience person");
//        }
//        else if(age>40){
//            System.out.println("You are semi-experience person");
//        }
//        else if(age>30){
//            System.out.println("You are semi-semi-experience person");
//        }
//        else
//        {
//            System.out.println("You are baby and playing game but not eat soil");
//        }
//    }
//}
