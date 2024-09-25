import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = 100;

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int result = arr[j] - arr[i];
                if(min>result) {
                    min = result;
                }
            }
        }
        System.out.println(min);
    }
}