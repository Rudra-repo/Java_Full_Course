import java.util.Scanner;

public class diagonal_elements {
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
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                if(i==j){
                    System.out.print(a[i][j]+ " ");
                }
            }
        }
    }
}
