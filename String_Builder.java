public class String_Builder {
    public static void main(String[] args) {
        /*
            NOTES :
            If we modify the string and we perform the string delete and string add than
            use string builder
         */
//
//        StringBuilder sb = new StringBuilder("Mony");
//        System.out.println(sb);
//
//        // Char at index 0
//        System.out.println(sb.charAt(0));
//
//        // Set chat at index
//        sb.setCharAt(0,'p');
//        System.out.println(sb);
//
//        // insert in string
//        sb.insert(0,'S');
//        System.out.println(sb);
//
//        sb.insert(3,'n');
//        System.out.println(sb);
//
//        // Delete in string
//        // Delete the extra n which add in above string
//        sb.delete(3,4);
//        System.out.println(sb);
//
        // Append -> Last mai jod dena
//        StringBuilder sb = new StringBuilder("h");     // IF we write in the string
//        sb.append('e');                               // str = str +"e"
//        sb.append('l');                               // str = str + "l"
//        sb.append('l');                               // str = str + "l"
//        sb.append('o');                              // str = str + "o"
//        System.out.println(sb);

        // Reverse the string
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0; i<sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 -i;  // 5 - 1 - 0  = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
