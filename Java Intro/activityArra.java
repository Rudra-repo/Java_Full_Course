import java.util.*;
public class activityArra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int sum = 0;
        for(int i = 0; i<size; i++){
            
            a[i]= sc.nextInt();
            
        }
        for(int j = 0; j < a.length; j++){
            sum = sum + a[j];
        }
        double avg = sum/a.length;
        System.out.println(avg);
        System.out.println(sum);
        
    }
}
