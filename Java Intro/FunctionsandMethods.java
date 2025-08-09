// import java.util.Scanner;

// public class FunctionsandMethods {
//     public static void printMyName(String name) {
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);
//     }
// }

// QUE: Make a function to add 2 numbers and return the sum.

// import java.util.Scanner;

// public class FunctionsandMethods {
//     public static int calculateSum(int a, int b) {
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = calculateSum(a, b);

//         System.out.println("Sum of two numbers is: "+sum);
//     }
// }

// QUE: Make a function to multiply 2 numbers and return the product.

// import java.util.Scanner;

// public class FunctionsandMethods {
//     public static int calculateProduct(int a, int b) {
//         int product = a*b;
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int product = calculateProduct(a, b);
//         System.out.println("Product of 2 numbers is: "+ product);
//     }
// }

// QUE: Find the factorial of a number.

import java.util.Scanner;

public class FunctionsandMethods {
    public static int calculateFactorial(int a) {

        int factorial = a*calculateFactorial(a-1) ;
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int factorial = calculateFactorial(a);

        System.out.println("Factorial of " + a +"is: "+factorial);

    }
}