import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];


        for(int i = 0; i<size; i++){
            a[i]= sc.nextInt();
        }

        // int b[] = new int[size];
        // for(int i = 0; i<size; i++){
        //     b[i] = a[size-1-i];

        // }
        // boolean isPalindrome = true;
        // for(int i= 0; i<size; i++){
        //     if(a[i]==b[i]){
        //         isPalindrome =false;
        //         break;
        //     }
        // }                                    // this is not optimized solution

        
        // boolean isPalindrome = true;
        // for(int i = 0; i < size/2; i++) {
        //     if (a[i] != a[size-1-i]) {
        //         isPalindrome = false;
        //         break;                  // this is optimized solution.
        //     }
        // }

        int start = 0 ; int end = size-1;
        boolean isPalindrome = true;
        while(start<end){
            if(a[start] != a[end]){
                isPalindrome = false;
                break;
                
            }
            start++;
            end--;
        }
        

        if(isPalindrome){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }

    }
}
