import java.util.Scanner;

public class Array_2D {
    public static void main(Strings[] args) {
        /*  Declaration -->
        type[][]arrayName = new type[rows][columns];
        int[][]numbers = new int[3][5];
          */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows");
//        int rows = sc.nextInt();
//        System.out.println("Enter the number of columns");
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[rows][cols];
//
//        //input
//        //row
//        for(int i = 0; i<rows;i++){
//            // columns
//            for(int j = 0; j<cols;j++){
//               numbers[i][j] =  sc.nextInt();
//            }
//        }
//
//        // output
//        for(int i = 0; i<rows; i++){
//            for(int j = 0 ; j<cols;j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Question ?
        /*
        Take a matrix as input from the user. Search for a given numbers x and print the indces at which it occurs.
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        //row
        System.out.println("Enter the element of 2D Array ");
        for(int i = 0; i<rows;i++){
            // columns
            for(int j = 0; j<cols;j++){
                numbers[i][j] =  sc.nextInt();
            }
        }

        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        // output
        for(int i = 0; i<rows; i++){
            for(int j = 0 ; j<cols;j++){
//                System.out.print(numbers[i][j] + " ");
                if(x == numbers[i][j]){
                    System.out.println("The x found at index is: (" + i + "," + j +" ) ");
                }
            }
            System.out.println();
        }
    }
}
