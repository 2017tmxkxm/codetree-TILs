import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];

        int sum1 = 0;
        int sum2 = 0;
        int cnt = 0;

        for(int i=1; i<=10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=2; i<=10; i+=2) {
            sum1 += arr[i];
        }

        for(int i=3; i<=10; i+=3) {
            sum2 += arr[i];
            cnt++;
        }

        System.out.printf("%d %.1f", sum1,  (double)sum2/cnt);
    }
}