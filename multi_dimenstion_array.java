public class multi_dimenstion_array {
    public static void main(String[] args) {
        int[] marks ; // A 1-D array
        int [][] flat; //  A 2-D Array;
        flat = new int [2][3];
        flat[0][0] = 101;  // Second floor;
        flat[0][1] = 102;
        flat[0][2] = 103;
        flat[1][0] = 201;  // first floor
        flat[1][1] = 202;
        flat[1][2] = 203;

        // Print 2-D array;
        for(int i = 0; i<flat.length;i++){
            for(int j = 0; j<flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
