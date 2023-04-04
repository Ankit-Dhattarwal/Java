public class Sorting_array {
    public static  void printarray(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Bubble sort
        // insertion sort
        // Selection sort

        // Bubble sort -->
        // n-1 comparing take for the n
        /*
        In this sorting be like that pickup the higest weight element and throw it to last
        and the second last higest weight that puch to the second last and be continue...
         */

        int arr[] = {5 , 7, 2, 1, 8};

        for(int i = 0 ; i<arr.length-1; i++){   // that simple run
            for(int j = 0 ; j<arr.length-i-1; j++){  // the inner loop compare the element but in intellegent way like first time compare n element and than compare the n - 1 and second time n- 2 so on..
           if(arr[j] >arr[j-1]){
               // swap
               int temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;
           }

            }

        }
        printarray(arr);
    }
}
