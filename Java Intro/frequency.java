import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        
        for(int i = 0; i<size; i++){
            a[i]= sc.nextInt();
        }
        int ans = a[0];
        for(int i = 0; i<size; i++){
            int count = 0;
            for(int j = 0; j<size; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count%2 != 0){
                ans = a[i];
                break;
            }
        }
    }
}
