public class Recursion {
    static int factorial(int n ){
        // factorial(n) = n * factorial(n-1);
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int iterative_factorial(int n ){
        // factorial(n) = n * factorial(n-1);
        if(n==1 || n==0){
            return 1;
        }
        else{
            int fact = 1;
            for(int i = 1; i<=n;i++){
                fact = fact * i;  // fact *= i;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        int x = 0;
        System.out.println("The value of factorial is: "+factorial(x));
        System.out.println("The value of factorial by itrative method is : "+factorial(x));
    }
}
