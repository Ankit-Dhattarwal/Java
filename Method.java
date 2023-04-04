public class Method {
    static int  logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = logic(a, b);

        System.out.println(c);

        int a1 = 6;
        int b1 = 3;
        int c1 = logic(a1, b1);
        System.out.println(c1);
    }
}
