// Que: Find min positive integer in every row & max negative integer in every column. If not present print 0 instead.

import java.util.*;
public class min_max {

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
        for(int i=0; i<n; i++){
            int min_Positive = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] > 0 || a[i][j] < min_Positive) {
                    min_Positive = a[i][j];
                }
            }
            System.out.println("row "+ i+"min_positive = "+min_Positive);
        }
        System.out.println();

        for (int j = 0; j < m; j++) {
            int max_Negative = 0;
            
            for (int i = 0; i < n; i++) {
                if (max_Negative == 0 ) {
                    max_Negative = a[i][j];
                }
            }
            System.out.println();
        }
    }
}