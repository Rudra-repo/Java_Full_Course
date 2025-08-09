// QUE: Print the pattern:-
// *****
// *****
// *****
// *****


// public class Practice {
//     public static void main(String[] args) {
        
//         // outer loop
//         for(int i = 1; i<5; i++) {
//             // inner loop
//             for(int j = 1; j<6; j++) {
//                 System.out.print("*");
//             } System.out.println();
//         }
//     }
// }

// QUE: Print the pattern (Hollow rectangle):-
// *****
// *   *
// *   *
// *****

// public class Practice {

//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;

//         // outer loop
//         for(int i = 1; i<=n; i++) {
//             // inner loop
//             for(int j = 1; j<=m; j++) {
//                 // cell-> (i,j)\
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern (Half triangle)
// *
// **
// ***
// ****

// public class Practice {

//     public static void main(String[] args) {
        
//         int n =4;

//         // outer loop
//         for(int i=1; i<=n; i++) {
//             // inner loop
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern (inverted half triangle):-
// ****
// ***
// **
// *

// public class Practice {

//     public static void main(String[] args) {

//         int n = 4;

//         // outer loop
//         for(int i=n; i>=1; i--) {
//             // inner loop
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern (half triangle):-
//    *
//   **
//  ***
// ****

// public class Practice {

//     public static void main(String[] args) {
        
//         int n =4;
//         int m =4;

//         for(int i=1; i<=n; i++) {
//             // inner loop -> space print
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");  
//             }
            
//             // inner loop -> star print
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

// public class Practice {

//     public static void main(String[] args) {
//         int n = 5;

//         // outer loop
//         for(int i = 1; i<=n; i++) {
//             // inner loop
//             for(int j = 1; j<=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

// public class Practice {

//     public static void main(String[] args) {
//         int n = 5;

//         // outer loop
//         for(int i=n; i>=1; i--) {
//             // inner loop
//             for(int j=1 ; j<=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

// public class Practice {

//     public static void main(String[] args) {
//         int n = 5;
//         int num = 1;

//         // outer loop
//         for(int i = 1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=i; j++) {
//                 System.out.print(num+" ");
//                 num++;  //number = number + 1
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Practice {

    public static void main(String[] args) {
        
        int n =5;
        // outer loop
        for(int i = 1; i<=5; i++) {
            for(int j = 1; j<=i; j++) {
                if((i+j)%2 == 0) {
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}