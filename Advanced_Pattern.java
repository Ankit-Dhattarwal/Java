public class Advanced_Pattern {
    public static void main(Strings[] args) {
        //  Question 10    Butterfly pattern
        int n = 5;

//        // upper half
//        for (int i = 1; i <= n; i++) {
//            // 1st part star
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int space = 2 * (n - i);
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//
//            // 2nd part
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        // second lower  half and this is opposite of the upper part say that 180 degree
//        for(int i = n;i>=1;i--){
//            // 1st part star
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            int space = 2 *(n-i);
//            for(int j = 1; j<=space;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

            // Question 11   Solid Rhombus
//          for(int i = 1; i<=n;i++){
//              //Spaces
//              int space = (n-i);
//              for(int j = 1; j<=space;j++){
//                  System.out.print(" ");
//              }
//                // Star
//              for(int j = 1;j<=n;j++){
//                  System.out.print("*");
//
//              }
//              System.out.println();
//          }

        // Question 12    Number pyramid
//        for(int i = 1; i<=n; i++){
//            int space = n-i;
//            for(int j = 1; j<=space;j++){
//                System.out.print(" ");
//            }
//            // numbers -> print row no, row no times
//            for(int j = 1; j<=i;j++){
//                System.out.print(i+" ");   // Baat 1 hi hai kon sa hi use kar le chaye ye ya niche wala code
////                System.out.print(" ");
//            }
//            System.out.println();
//        }

        // Question 13     Palindromic Pattern
        // Meaning of PP(Palindromic Pattern )  that looks like same see from the front and from the back ;
//        for(int i = 1; i<=n;i++){
//            // Space print
//            int space = n-i;
//            for(int j = 1; j<=space;j++){
//                System.out.print(" ");
//            }
//            // First half numbers
//            for(int j = i; j>=1;j--){
//                System.out.print(j);
//            }
//
//            // Second half numbers
//            for(int j = 2; j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Question 14        Diamond Pattern
        int m = 4;
        // Upper half
       for(int i = 1 ;i<=m;i++){
           // Spaces
           for(int j = 1; j<=m-i;j++){
               System.out.print(" ");
           }
           // Star
           for(int j = 1; j<=2 * i-1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
       // lower half
        for(int i = m ;i>=1;i--){
            // Spaces
            for(int j = 1; j<=m-i;j++){
                System.out.print(" ");
            }
            // Star
            for(int j = 1; j<=2 * i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

