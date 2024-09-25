import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int temp = n;

        for(int i=1; i<n+1; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n+1; i++) {
            int max = -1;
            int index = 0;
            for(int j=1; j<n+1; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            System.out.print(index + " ");
            n = index-1;
            i = 1;
            if(n==1) {
                System.out.print(1);
                break;
            }
        }

    }
}