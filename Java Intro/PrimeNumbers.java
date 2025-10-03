import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + " are:");

        for(int i = 2; i <= n; i++) {
            boolean isPrime = true;   // assume number is prime

            // check divisibility
            for(int j = 2; j <= i-1; j++) {
                if(i % j == 0) {
                    isPrime = false;  // not prime
                    break;
                }
            }

            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
