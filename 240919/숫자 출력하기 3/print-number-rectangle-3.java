import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int temp = 0;
            for(int j=0; j<m; j++) {
                System.out.print(temp + i + " ");
                temp += 4;
            }
            System.out.println();
        }
    }
}