import java.sql.SQLOutput;

class Base1 {
    Base1(){
        System.out.println("I am constructor of the Base class");
    }

    Base1(int x){
        System.out.println("I am an overloaded constructor of the Base class "+ x);
    }
}
class Derived1 extends Base1{

    Derived1(){
        // If you want the to access the agrument constructor then use super keyword;
        // Then only call then overloaded constructor and not call the simple construction;
       // super(0);
        System.out.println("I am the constructor  of the Derived class ");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am the overloaded constructor of the Derived class with value of y as: "+ y);
    }
}

class ChildOfDerived extends Derived1{

    ChildOfDerived(){
        System.out.println("I am the constructor of the ChildOfDerived class ");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am the constructor of the ChildOf Derived class and the value of the z is: "+ z);
    }
}

public class constructor_inheritance {
    public static void main(String[] args) {
   // Base b = new Base();

        // Derived1 d = new Derived1(); // This first call the constructor of the Base class then own
//        Derived1 d = new Derived1(14,9);

        // ChildOfDerived f = new ChildOfDerived();
        ChildOfDerived f = new ChildOfDerived(15, 23, 67);

        //

    }
}
