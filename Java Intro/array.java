import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];

        for(int i = 0; i<size; i++){
            a[i]= sc.nextInt();
        }

        System.out.println(a[0]+a[1]+a[2]);
        
    }
}