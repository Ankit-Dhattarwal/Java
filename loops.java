import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // for , while, dowhile, foreach(arrays)
        for(int i = 0; ;){
            System.out.println("Enter the name");
            String b = Sc.next();
            if(b.equals("Deep")){
                break;
            }
        }
    }
}

