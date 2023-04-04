import java.util.*;
public class Strings {
    public static void main(String[] args) {

        // String are Immutable
        // --> If we make a string than we not change the string and not add any more and not delete and if we
        //     want to modify in string than make/create  a new string

        // Note --> Java k andher string object hoti hai


        // Declaration
//        String name = "Ankit";
//        String FullName = "Ankit Dhatterwal";
//        String sentence = "My name is Ankit Dhatterwal";
//


        // Taking string from the user and userinput
//
//                Scanner sc = new Scanner(System.in);
//     //   String name = sc.next();   this is only for the one world take and print
//
//        // If we want take more input and full sentence than use below code
//        String  name = sc.nextLine();
//        System.out.println("Your name is " + name);
//

        //concatenation
        // Simple means that add two string
//        String firstName = "Ankit";
//        String lastName = "Dhatterwal";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
        // sout(A.concat(B))
//
//        // How to calculate the length of string
//        System.out.println(fullName.length());
//
//        // charAt --> to access the one by one index of string
//        for(int i = 0; i<fullName.length();i++){
//            System.out.println(fullName.charAt(i));
//        }

        // Compare the string

        // 1. -> S1>S2 : +ve value return
        // 2. -> S1==S2 : 0
        // 3. -> S1<S2 : -ve value

//        String name1 = "Ankit";
//        String name2 = "Ankit";
//
//        if(name1.compareTo(name2) == 0){
//            System.out.println("The given strings are equal");
//        }
//        else{
//            System.out.println("Strings are no equal");
//        }


        /* The below code not use to compare the string bcz
            it always not give us the correct answer and
            so always use the dot compare fuction use
         */


//        if(name1 == name2){
//            System.out.println("The given strings are equal");
//        }
//        else{
//            System.out.println("Strings are no equal");
//        }

        // Sub-String

        /*
           If we want to print the Ankit only from the upper line than
           use substring  fuction and than pass starting index and final index number
           and important note is that if we pass ending index ( 5 ) than our function
            run only for at the 4 means that if we pass n than goes at the n-1
         */

//        String sentence = "My name is Ankit";
//        String name = sentence.substring(11,sentence.length());
        // if emding index is our last index than pass only starting index than it work ;
//        System.out.println(name);



    }
}
