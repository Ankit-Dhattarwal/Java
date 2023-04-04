import java.util.Scanner;
public class java_strings {
    public static void main(String[] args) {
//        String name = new String("Ankit");
//        System.out.println(name);
//        int a = 2;
//        float b = 3.456f;
//        System.out.printf("The value of a is %d and the value of b is %8.2f", a ,b);
     //   System.out.printf("The value of a is %d and the value of b is %f", a ,b);
        // --> this upr case use then show ..... b is       3.45; this is bcz use 8 so it give in 8 decimal or word and .2 give us after point two values;
//        System.out.format("The value of a is %d and the value of b is %f", a ,b);   //--> Same work like to the print the value like printf;
         Scanner sc =  new Scanner(System.in);
       //  String st = sc.next();   // ---> This take only 1 word of line like "This is ankit"  so it only take and show "This";
        String st = sc.nextLine();   // --> This is use for the print full line;
        System.out.println(st);

    }
}

