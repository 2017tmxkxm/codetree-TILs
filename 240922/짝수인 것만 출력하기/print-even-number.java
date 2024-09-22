import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] num = new int[n];

        int[] even = new int[n];

        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
            if(num[i]%2==0) even[i] = num[i];
        }

        for(int i=0; i<n; i++) {
            if(even[i] != 0) System.out.print(even[i] + " ");
        }
    }
}