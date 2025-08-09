// QUE: WAP to find out whether a person is adult or not.

// import java.util.Scanner;

// public class Conditional_Statements {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age > 18) {
//             System.out.println("Adult");
//         } else {
//             System.out.println("Not Adult");
//         }
//     }
// }

// QUE: WAP to find whether a number is odd or even.

// import java.util.Scanner;

// public class Conditional_Statements {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if(num % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }

// QUE: WAP to find out which number of two is greater using if-else statement only.

// import java.util.Scanner;

// public class Conditional_Statements {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         if(a == b) {
//             System.out.println("Equal");
//         } else {
//             if(a > b) {
//                 System.out.println("a is greater");
//             } else {
//                 System.out.println("a is lesser");
//             }
            
//         }
//     }
// }

// QUE: WAP to find out which two of number is greater using if-else if-else .

// import java.util.Scanner;

// public class Conditional_Statements {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         if(a == b) {
//             System.out.println("Equal");
//         } else if (a > b) {
//             System.out.println("a is greater");
//         } else {
//             System.out.println("a is lesser");
//         }
//     }
// }

// if ke sath agar hum { } use karte to mutiple statement pass kar sakte hai. lekin agar { } use nahi bhi karte hai to bhi koi dikkat nahi lekin sirf single statement pass kar sakte hai. aur (;) nahi lagana hai last me nahi to error aa jayega.

// Agar hum if , else if , else ka use karte hai to statement one by one check hogi agar if wali galat hogi to next else if par jayegi and then else lekin agar hum if if if ya if else else else karenge to sari statement check hogi fir result aayega.

// QUE: Print the Greeting in different languages.

// import java.util.Scanner;

// public class Conditional_Statements {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button == 1) {
//             System.err.println("Hello");
//         } else if ( button == 2) {
//             System.out.println("Namaste");
//         } else if ( button == 3) {
//             System.out.println("Bonjour");
//         } else {
//             System.out.println("Invalid Button.");
//         }
//     }
// }

import java.util.Scanner;

public class Conditional_Statements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;
        
            default:
                System.out.println("Invalid button");
                break;
        }
    }
}