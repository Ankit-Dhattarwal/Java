import java.util.Scanner;
public class Table_02{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kon se table yaad hai");
        int n = sc.nextInt();
        System.out.println("Table kha tak yaad hai");
        int c = sc.nextInt();
        for(int i = 1;i<=c;i++){
            int a = n*i;
            System.out.println(a);
        }
    }
}

