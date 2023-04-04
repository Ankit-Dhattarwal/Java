public class String_again {
    public static void main(String[] args) {
        String name = "AnKit";
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();  // In this not change original string;
        System.out.println(ustring);

        String nonTrimmedstring = "       ANkit    ";  // This also print space
        System.out.println(nonTrimmedstring);
         String trimmedstring = nonTrimmedstring.trim();
       // System.out.println(nonTrimmedstring.trim());  // This is not print space simple print;
        System.out.println(trimmedstring);

        System.out.println(name.substring(3));  // jo index deya gya h usse aage sare print hov ge ;
        System.out.println(name.substring(1,4));
        // In this we can se that last (4) is not including means that if you want to print to string from ( n to t )
        // then you give (1,5 ) , in this last give more than you want ;

//        System.out.println(name.replace('t', 'y')); // This is use to replace the char like repclace the
        // the t into y then print ANkiy;

        System.out.println(name.replace("AnKit", "Amany jaat"));

        System.out.println(name.startsWith("An"));  // This is use for chk given index start with An or not give answer in true or false

        System.out.println(name.endsWith("Hay"));

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("Ki"));

        System.out.println(name.equals("AnKit"));  // This is use to compare the two string in this case is matter like upper or lower;
        System.out.println(name.equalsIgnoreCase("ankit jaat"));  // This is use for the ingore the case doest matter case is lower or uppr just compare;

        System.out.println("I am escape the sequence \" double quote");  // this is use to print double quote ( " );
        System.out.println("I am escape the sequence \\ double quote");
        System.out.println("I am escape the sequence \" double quote \" i am here");
        System.out.println("I am escape the sequence \n double quote");
        System.out.println("I am escape the sequence \t double quote");
    }



}
