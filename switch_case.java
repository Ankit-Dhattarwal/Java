import java.util.Scanner;

public class switch_case {
    public static void main(string_q01[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice(1-7): ");
        int a = sc.nextInt();

        switch (a){
            // case 1 is not always write case it our choice and we also write it to the case 10;
            // Simpley say that the inside case 1 and 1 is the value of the a;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Dont know");
        }
    }
}
