class MyGoodEmployee{
    // public String setId;
    private int Id;
    private String name;
    public MyGoodEmployee(){   // IF you can not pass and type of id and name then it run automatically;
        Id = 0;
        name = "Your-name-Here";

    }

    public MyGoodEmployee(String myname, int myid){
        Id = myid;
        name = myname;

    }
    public void  setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public  void setId(int i ){
        Id = i;
    }
    public int getId(){
        return Id;
    }

}

public class Constructor {
    public static void main(String[] args) {
     //  MyGoodEmployee Ankit = new MyGoodEmployee("CodeWithAnkit", 80);
        MyGoodEmployee Ankit = new MyGoodEmployee();

       // Ankit.setname("Ankit Dhatterwal");
       // Ankit.setId(1);   // --> If we set id only then print id and name print form constructor
        System.out.println(Ankit.getId());  // In this we not set name or id but print the id and name -->
        System.out.println(Ankit.getname());
    }
}
