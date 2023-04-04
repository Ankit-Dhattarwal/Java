import java.util.*;

public class Array_q2 {
    public static void main(string_q01[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
       int sum = 0;
        int lng = sc.nextInt();
        int []A = new int[lng];

        for(int i = 0;i<lng;){
            System.out.println("Enter the number: "+(i+1));
            A[i] =sc.nextInt();

            if(A[i]<450 && A[i]>15){
                sum += A[i];
                i++;
            }
        }
        int avg = sum /lng;
        System.out.println(avg);
    }
}
