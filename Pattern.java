// Question 1 is to print solid rectangle

import java.util.Scanner;
public class Pattern {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of row to print stars");
//        int n = sc.nextInt();
//        System.out.println("Enter the number of column to print star");
//        int c = sc.nextInt();
//        for(int i = 1; i<=n;i++) {
//            for (int j = 1; j <= c; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Question 2 to print the hollow rectangle
//        for(int i = 1;i<=n;i++){
//            for(int j = 1; j<=c;j++){
//                // cell--> (i,j)
//                if(i==1 || j==1 || i==n || j==c){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

        // Question 3  Print half pyramid;
//        for(int i = 1 ; i<=n;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Question 4      Inverted Half Pyramid
//        for (int i = n; i >= 1; i--) {
//            for (int j = i; j >= 1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
        // 1 more method for same question 4
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

        // Question 5   Inverted Half Pyramid(rotated by 180 degree);
        // outer loop
//        for(int i = 1; i<=n;i++){
//            // inner loop -> TO print space
//            for(int j = 1 ; j<=n-i;j++){
//                System.out.print(" ");
//            }
//            // inner loop ->To print the star
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Question 6   Half Pyramid with numbers
//          for(int i = 1; i<=n;i++){
//              for(int j = 1; j<=i;j++){
//                  System.out.print(j);
//              }
//              System.out.println();
//          }

        //Question 7  inverted Half Pyramid with Numbers;
//       for(int i = n; i>=1;i--){
//           for(int j=1;j<=i;j++){
//               System.out.print(j);
//           }
//           System.out.println();
//       }
        // ! more method for same question 7
//        for(int i = 1;i<=n;i++){
//            for(int j = 1; j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Question 8      Floyd's Triangle
//        int number = 1;
//        for(int i = 1; i<=n;i++){
//            for(int j = 1; j<=i;j++){
//                System.out.print(number+" ");
//                number = number+1;  // number++;
//            }
//            System.out.println();
//        }

        // Question 9     0-1 Triangle
//        for(int i = 1; i<=n;i++){
//
//            for(int j = 1; j<=i;j++){
//                int sum = i+j;
//                if(sum % 2 == 0){ // even
//                    System.out.print("1 ");
//                }
//                else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }


        // Homework
        // Question 1
//        for(int i = 1;i<=n;i++){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

        // Question 2
//        System.out.println("Enter the number either 1 or 0 ");
//        int a = sc.nextInt();
//        if(a==1){
//            System.out.println("Enter the students marks(out of 100)");
//            int marks = sc.nextInt();
//
//        }
//        else{
//            System.out.println("You enter the value is 0\n Thanks you ");
//        }
//
 }
}