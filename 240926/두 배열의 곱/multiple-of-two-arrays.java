import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        // A 배열 받기
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // B 배열 받기
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // 같은 위치에 있는 숫자의 곱 출력
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                C[i][j] = A[i][j] * B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}