class MyEmployee{
   // public String setId;
    private int Id;
    private String name;
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

public class getter_setters {
    public static void main(String[] args) {
        MyEmployee Ankit = new MyEmployee();
//        Ankit.id = 34;                  // But it is private so not access direct so use getter and setter
//        Ankit.name = "Ankit Dhatterwal";
        Ankit.setname("CodeWithAnkitDhatterwal");
        System.out.println(Ankit.getname());
        Ankit.setId(34);
        System.out.println(Ankit.getId());

    }
}
