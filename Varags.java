

public class Varags {
//    static int sum(int a, int b){
//     return a+b;
//    }
//
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    // For that type not use same upper logic  and use varags

    // Uses of Vargas ->
//    static int sum(int...arr){
//        int result = 0;
//        for(int a: arr){
//            result += a;
//        }
//        return result;
//    }

    // The below code is modify of upper code and in this
    // we apply a conditon that is we pass 1 element atleast;

    static int sum(int x,int...arr){
        int result = x;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println("The sum of 4 and 5 is "+sum(4,5));
//        System.out.println("The sum of 3, 4 and 5 is "+sum(3,4,5));
//        System.out.println("The sum of 2, 3, 4 and 5 is "+sum(5,3,4,5));

        // In this we pass the aruguments in that types and this ways

        // So for modifies code we can not call  directly [ sum() ]  and so we pass 1 element atleast neither it show error ;
//        System.out.println("The sum of nothing is "+sum());

        System.out.println("The sum is "+sum( 1));
        System.out.println("The sum is "+sum( 4, 5));
        System.out.println("The sum is "+sum( 4, 5,7));
        System.out.println("The sum is "+sum( 4, 5,7,5));


    }
}
