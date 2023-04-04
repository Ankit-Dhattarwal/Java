import java.util.Scanner;

public class Conditional_logical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a>=15 && a>=18){
            System.out.println("In ifside");
        }
        else{
            System.out.println("In elseside");
        }
    }
}
