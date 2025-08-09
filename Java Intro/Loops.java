// public class Loops {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//     }
// }

// Loops are of three types:-
// 1. for loop
// 2. while loop
// 3. do while loop

// for(intialisation;condition;updation){
// do something
// }

// public class Loops {

//     public static void main(String[] args) {
//         // count++ => count = count + 1 or count+=1
//         for(int count = 0; count < 100; count+=1) {
//             System.out.println("Hello World");
//         }
//     }
// }

// public class Loops {

//     public static void main(String[] args) {
//         // for(int count = 1; count <11; count++) {
//         //     System.out.print(count+" ");

//         for (int i = 1; i < 11; i++) {
//             System.out.println(i);
//         }

//         }
//     }

// QUE: Print the numbers from 0 to 10
// 0 1 2 3 4 5 6 7 8 9 10

// public class Loops {

//     public static void main(String[] args) {
//         for(int i = 0; i < 11; i++) {
//             System.out.print(i+" ");
//         }
//     }
// }

// while loop:-

// while(condition){
// do something
// }

// public class Loops {

//     public static void main(String[] args) {
//         int i = 0;
//         while(i < 11) {
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// do while loop:-

// do {
// do something
// } while(condition)

// public class Loops {

//     public static void main(String[] args) {
//         int i = 0;
//         do {
//             System.out.println(i);
//             i++;
//         }while(i < 11);
        
//     }
// }

// Checking for False condition for do-while loop:-

// import java.util.Scanner;

// public class Loops {

//     public static void main(String[] args) {
        // int i = 12;
        // while(i < 11) {
        //     System.out.println("Rudra Pratap");
        //     i++;

//         int i = 12;
//         do {
//             System.out.println("Rudra Pratap");        // do while prints at least one time even after the condition is false.
//             i++;                          // use do while when you have to print atleast one time even after condition is not true. 
//         } while(i < 11);
        
//     }
// }

// QUE: Print the sum of first n Natural Numbers.

// import java.util.Scanner;

// class InnerLoops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i < (n+1); i++ ) {
//              sum = sum +i;
            
//         }
//         System.out.println(sum);

//     }
// }

// QUE: Print the table of a number input by the user.

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        for(int i = 1; i<11; i++) {
            System.out.println(i*n);
        }  
    }
}