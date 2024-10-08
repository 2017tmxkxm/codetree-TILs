import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        // 배열 받기
        for(int i=0; i<2; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int all = 0;

        // 가로 평균
        for(int i=0; i<2; i++) {
            int sum = 0;
            for(int j=0; j<4; j++) {
                sum += arr[i][j];
                all += arr[i][j];
            }
            System.out.printf("%.1f ", (double)sum/4);
        }

        System.out.println();

        // 세로 평균
        for(int i=0; i<4; i++) {
            int sum = 0;
            for(int j=0; j<2; j++) {
                sum += arr[j][i];
            }
            System.out.printf("%.1f ", (double)sum/2);
        }

        System.out.println();

        // 전체 평균
        System.out.printf("%.1f", (double)all/8);
    }
}