public class Array {
    public static void main(String[] args) {
        //  int [] marks = new int[5];
//        int [] marks;
//        marks = new int [5];
//        marks[0] = 12;
//        marks[1] = 23;
//        marks[2] = 34;
//        marks[3] = 45;
//        marks[4] = 56;
//        System.out.println(marks[3]);


        int[] marks = {34, 56, 76, 23, 22, 67};
//        for (int i = 0; i < marks.length; i++) {
//        //    System.out.println(marks[i]);
//        }
        // using for-each loop;
        for(int element : marks){
            System.out.println(element);
        }
    }
}
