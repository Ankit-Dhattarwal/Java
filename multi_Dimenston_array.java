import java.util.Scanner;

public class multi_Dimenston_array {
    public static void main(string_q01[] args) {
        Scanner sc = new Scanner(System.in);
        int Temp;
        int A[][] = new int[5][4];

//        for(int i = 0;i<5;i++){
//            for(int j = 0;j<3;j++){
//                A[i][j] = sc.nextInt();
//            }
//        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the id of employe: ");
            A[i][0] = sc.nextInt();

            System.out.println("Enter the salary of employe: ");
            A[i][1] = sc.nextInt();

            System.out.println("Enter the holiday of employe: ");
            A[i][2] = sc.nextInt();

            Temp = A[i][1] -((A[i][1] / 30) *A[i][2]);
            A[i][3] =Temp;

        }
        for(int i = 0;i<5;i++){
            System.out.println("Salary of Emp"+(i+1)+ " is: "+A[i][3]);
        }
    }
}
