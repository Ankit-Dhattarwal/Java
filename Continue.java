
public class Continue {
    public static void main(String[]args){
        for(int i = 1; i<=10;i++){
            if(i == 5){
              //  continue;
                return;  // it will terminate all the loop /program
                // break ---> It terminate the current loop and current condition
            }
            else{
                System.out.println(i);
            }

    }
        System.out.println("This is not work in the return keywords");
    }
}
