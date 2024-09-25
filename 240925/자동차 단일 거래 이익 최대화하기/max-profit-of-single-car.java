import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = 0;
        int index = 0;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        if(index+1==n) {
            System.out.println(0);
        }else {
            for(int i=index; i<n; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max-min);
        }
    }
}