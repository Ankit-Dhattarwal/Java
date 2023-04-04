
class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my id is " +id);
        System.out.println("and my name is " +name);
    }
}
public class oops_CHW {
    public static void main(String[] args) {
        System.out.println("This is over custom class");

        Employee ankit = new Employee(); // Instantiating a new Employee Obeject;
        Employee aman = new Employee();

        // Setting Attributes
        ankit.id = 23;
        ankit.name = "CoderAnkitDhatterwal";
        aman.id = 45;
        aman.name = "AmanDhatterwal";

        // printing the attributes
        ankit.printDetails();
        aman.printDetails();
//        System.out.println(ankit.id);
//        System.out.println(ankit.name);
    }
}
