public class partices_set03 {
    public static void main(String[] args) {
        // Question 1
        String name = "ANiKt";
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        // Question 2
        String text = "Hello ankit kase ho ";
        System.out.println(text.replace(" ", "_"));

        // Question 3
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>", "Ankit"));

       // Question 4
        String myString = "This string contains  double and triple   space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Question 5
        String letter2 = "Dear Ankit, This is nice work.Thanks";
        String myletter = "Dear Ankit,\n\tThis is nice work.\nThanks";
        System.out.println(myletter);
    }
}
