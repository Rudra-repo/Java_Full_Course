import java.util.Scanner;

public class largestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        
        for(int i = 0; i<size; i++){
            a[i]= sc.nextInt();
        }

        int maxElement = a[0];
        for(int i = 0; i<size; i++){
            maxElement = Math.max(maxElement, a[i]);
            // if(maxElement > a[i]){
            //     maxElement = a[i];
            // }
            // else{
            //     System.out.println(a[i+1]);
            // }
        }
    }
}
