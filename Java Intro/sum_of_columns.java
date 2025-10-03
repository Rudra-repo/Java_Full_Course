import java.util.Scanner;

public class sum_of_columns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // row
        int m = sc.nextInt();       // col

        int a[][] = new int[n][m];
        

        for(int i=0; i<n; i++){
            
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            int sum =0;
            for(int j = 0; j<n; j++){
                sum = sum + a[j][i];
            }
            System.out.println(sum);
    }
}
}
