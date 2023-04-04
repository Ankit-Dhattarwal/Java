import java.util.Scanner;
public class row_col {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int n = sc.nextInt();
        System.out.println("Enter the number of col");
        int c = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0; j<c;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    //    System.out.println();
    }
}
