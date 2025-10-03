import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // row
        int m = sc.nextInt();       // col

        int a[][] = new int[n][m];
        

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        

        // int a[] = {1,2,3,4};

        // int a[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };
        

        // int size = sc.nextInt();
        // int[][] a= new int[size][size];
        

        // for(int i=0; i<size; i++){
        //     for(int j=0; j<size; j++){
        //         a[i][j] = sc.nextInt();
        //     }
        // }
    }
}
