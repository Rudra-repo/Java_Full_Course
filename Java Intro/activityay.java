import java.util.*;
public class activityay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int sum = 0;
        for(int i = 0; i<size; i++){
            a[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int i = 0, j = size-1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        
        for(int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(Arrays.toString(a));
    }
}
