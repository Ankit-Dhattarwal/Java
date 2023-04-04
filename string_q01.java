import java.util.*;
public class string_q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first name: ");
//       String c = sc.next();
//
//        System.out.println("Enter second name: ");
//        String b = sc.next();

//        if(c == b){
//            System.out.println("The given string are equal");
//        }
//        else
//            System.out.println("Not Equal");
//        String c = new String("Ankit");
//        String b = new String("Ankit");
//
//        // Inside above code == is not work

        // <----------Lets see .compare ----------->
        System.out.println("Enter first name: ");
       String c = sc.next();

        String b = new String("Ankit");

        String a = "Ankit";
        System.out.println(a.compareTo(c));

//        if(c.equals(b)){
//            System.out.println("The given string are equal");
//        }
//        else
//            System.out.println("Not Equal");

    }
}
