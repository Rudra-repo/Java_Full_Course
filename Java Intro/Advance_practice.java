// QUE: Print the pattern:-
// *             *
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *

// public class Advance_practice {

//     public static void main(String[] args) {
//         int n = 4;
//         // upper half
//         for(int i = 1; i<=n; i++) {
//             // for first part
//             for(int j = 1; j<=i; j++) {
//                 System.out.print("*"+" ");
//             }
//             // for space print
//             int spaces = 2*(n-i);
//             for(int j = 1; j<=spaces; j++) {
//                 System.out.print(" "+" ");
//             }
//             // for second part
//             for(int j = 1; j<=i; j++) {
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
    
//     // for lower half
//         for(int i = n; i>=1; i--) {
//             // for first part
//             for(int j = 1; j<=i; j++) {
//                 System.out.print("*"+" ");
//             }
//             // for space print
//             int spaces = 2*(n-i);
//             for(int j = spaces; j>=1; j--) {
//                 System.out.print(" "+" ");
//             }
//             // for second part
//             for(int j = 1; j<=i; j++) {
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }
    
    
// QUE: Print the pattern:-

//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

// public class Advance_practice {

//     public static void main(String[] args) {
//         int n = 5;
        
//         for(int i = 1; i<=n ; i++) {
//             // for space print
//             for(int j =1; j<=n-i; j++) {
//             System.out.print(" "+" ");
//             }
//             // for star print
//             for(int j = 1; j<=5; j++) {
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

// public class Advance_practice {

//     public static void main(String[] args) {
//         int n = 5;

//         for(int i=1; i<=n; i++){
//             // for space
//             for(int j = 1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             // for numbers
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

// public class Advance_practice {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=1; i<=n; i++){
//             // for space
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" "+" ");
//             }
//             // for numbers
//             for(int j = i; j>=1 ; j--) {
//                 System.out.print(j+" ");
//             }
//             for(int j = 2; j<=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// QUE: Print the pattern:-
//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

public class Advance_practice {

    public static void main(String[] args) {
        int n = 4;
        // for upper part of diamond
        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }
            // for stars
            for(int j = i; j>=1; j--) {
                System.out.print("*"+" ");
            }
            // for 2nd part of stars
            for(int j = 2; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            // for space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }
            // for stars
            for(int j = i ; j>=1; j--) {
                System.out.print("*"+" ");
            }
            // for 2nd part of stars
            for(int j = 2; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}