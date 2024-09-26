import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        int sum = 0;

        // 배열 받기
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 합계 구하기
        for(int i=0; i<4; i++) {
            for(int j=0; j<i+1; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);

    }
}