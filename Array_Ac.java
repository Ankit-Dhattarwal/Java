import java.util.Scanner;

public class Array {
    public static void main(Strings[] args) {

        // Defining the array
//        int arr[] = new int[4];
//        arr[0] = 23;
//        arr[1] = 32;
//        arr[2] = 64;
////
        // Simple way

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        // But if more numbers are there than using for loop

//        for(int i = 0; i<3;i++){
//            System.out.println(arr[i]);
//        }

        // Defining the array another way

        // type[]arrayName = {1,2,3,4,5};
//        int arr[] = {23,32,64};
//
//        for(int i = 0; i<3;i++){
//            System.out.println(arr[i]);
//        }
//

        // When input take by the user and how to take user-input

//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//        //input
//        for(int i = 0; i<size;i++){
//            numbers[i] = sc.nextInt();
//       }
//
//        // output
//        for(int i = 0; i<size;i++){
//            System.out.println(numbers[i]);
//        }

        // Question ?
        /* Take an input form the user. Search for a given number x and
        print hte index at which it occurs.
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        System.out.println("Enter the number of elements of array ");
        for(int i = 0; i<size;i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the value of the x");
        int x = sc.nextInt();

        // output
        for(int i = 0; i<numbers.length;i++){
            if(x == numbers[i]){
                System.out.println("The value of x at index at: "+ i);
            }
        }

    }
}
