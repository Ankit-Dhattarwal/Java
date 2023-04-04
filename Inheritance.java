class base {
    int x;

    // Make getter and  setter of x
    public void setx(int x) {      // Not ignore this that we only access the public class in this code;
        System.out.println("I am in the base class and the value of  x is: ");
        this.x = x;
    }

    public int getx() {
        return x;
    }
}


    /* IF in below class we want to use the above class code and than we simple copy and paste
    but after some times we change the code then also change in the code of below class code then again and again
    change the code on both side and so we use inheritance

     */

    class derived extends base{
        int y;

        // Make the getter and setter
        public void  sety(int y ){
            this.y = y;
        }
        public int gety(){
            return y;
        }
    }



public class Inheritance {
    public static void main(String[] args) {
        // For inheritance we use extends keywords

        // Making the object of base class
        base b = new base();
        b.setx(6);
        System.out.println(b.getx());

        // Making the object of the derived class
        derived d = new derived();
        d.sety(5);
        System.out.println(d.gety());

        // By inheritance we also access the x
        d.setx(45);
        System.out.println("Now get the value of x by class derived and the value is: "+ d.getx());


    }

}
