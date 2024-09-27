import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        int num = 0;

        // 배열에 값 넣기
        for(int i=0; i<m; i++) {
            // 짝수 행일 경우
            if(i%2==0) {
                for(int j=0; j<n; j++) {
                    arr[j][i] = num++;
                }
            // 홀수 행일 경우
            }else {
                for(int j=n-1; j>=0; j--) {
                    arr[j][i] = num++;
                }
            }
        }

        // 배열 출력
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}