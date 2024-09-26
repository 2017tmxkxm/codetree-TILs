import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        int[][] C = new int[n][m];

        // A 배열 받기
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // B 배열 받기
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 같은 위치에 있는 숫자의 곱 출력
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(A[i][j] == B[i][j]) C[i][j] = 0;
                else C[i][j] = 1;
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}