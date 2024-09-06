import java.util.Scanner;

public class Main {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       for(int i=0; i<n; i++) {
           int a = sc.nextInt();
           sum += a;
       }

        System.out.printf("%d %.1f", sum, (double)sum/n);
    }
}