class Find{
    int side;
    int length;
    int breadth;
      public int area(){
          return side*side;
      }
      public int perimeter(){
          return 4 * side;
    }
    public int rectangle(){
         return length * breadth;
    }
        }


public class partices_set_oops {
    public static void main(String[] args) {
         Find fnd = new Find();
         fnd.side = 3;
         fnd.length = 2;
         fnd.breadth = 4;
        System.out.println(fnd.area());
        System.out.println(fnd.perimeter());
        System.out.println(fnd.rectangle());
    }
}
