import java.util.Scanner;

public class hq {
    public static void main(string_q01[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int x = 0;
        for (int i = 0; i < c; i++) {
            if (i % 2 == 0) {
                x++;
            }
        }
        System.out.println(x);

    }
}
