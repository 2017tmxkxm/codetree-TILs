import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        // 배열에 값 넣기
        for(int i=1; i<n+1; i++) {
            int num = i;
            if(i%2==1) {
                for(int j=1; j<n+1; j++) {
                    arr[i][j] = num;
                    num+=n;
                }
            }else {
                for(int j=1; j<n+1; j++) {
                    arr[i][j] = num;
                    num+=n;
                }
            }
        }

        // 배열 출력
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<n+1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}