class Cylinder{
    private int radius;
    private int height;

    // Construction Used


    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double SurfaceArea(){
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double Volume(){       // ---> Function
        return 3.14 * radius * radius * height;
    }

}
class Rectangle{
    private int  Length;
    private int   Breadth;

   //  Make Construction

    public Rectangle(int length , int breadth){
        this.Breadth = breadth;
        this.Length = length;
    }
    public Rectangle(){
        this.Breadth = 4;
        this.Length = 5;
    }
//    public int para(){
//        return  2 * (Length + Breadth);
//    }
    // Use Getter
    public int getLength(){
        return Length;
    }
    public int getBreadth(){
        return Breadth;
    }
}

public class partices_set05 {
    public static void main(String[] args) {
        /* Create a class Game , which allows a user to play "Guess the Number"
         game once.  Game should have the following methods:
         1. Construction to generate the random number
         2. TakeUserInput  to take a user input of number
         3. isCorrectNUmber()  to detect whether the number entered by the user is true
         4. getter and setter  for noOfGuesses
         Use properties such as noOfGuesses(int), etc to get this task done;
         */


        // Question 1
        /*
        Cylinder MyCylinder =  new Cylinder();
        MyCylinder.setRadius(4);
        System.out.println("The Radius of MyCylinder is: "+MyCylinder.getRadius());
        MyCylinder.setHeight(6);
        System.out.println("The Height of MyCylinder is: "+MyCylinder.getHeight());

         */


        // Question 2

//        Cylinder MyCylinder =  new Cylinder();
//        MyCylinder.setRadius(9);
//        System.out.println("The Radius of MyCylinder is: "+MyCylinder.getRadius());
//        MyCylinder.setHeight(12);
//        System.out.println("The Height of MyCylinder is: "+MyCylinder.getHeight());
//        System.out.println("The Surface Area of Cylinder is: "+MyCylinder.SurfaceArea());
//        System.out.println("The Volume of Cylinder is: "+MyCylinder.Volume());

        // Question 3
//        Cylinder MyCylinder =  new Cylinder(9,12);
//
//        System.out.println("The Radius of MyCylinder is: "+MyCylinder.getRadius());
//
//        System.out.println("The Height of MyCylinder is: "+MyCylinder.getHeight());


        // Question 4
        Rectangle parameter = new Rectangle();
        System.out.println("The length of rectangle is: "+ parameter.getLength());
        System.out.println("The breadth of the ractangle is: "+parameter.getBreadth());
      //  System.out.println("The parameter of the rectangle is: "+parameter.para());
    }
}
