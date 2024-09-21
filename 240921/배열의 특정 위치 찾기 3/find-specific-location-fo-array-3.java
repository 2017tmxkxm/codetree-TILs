import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n;
            if(arr[i] == 0) {
                cnt = i;
                break;
            }
        }

        System.out.println(arr[cnt-1] + arr[cnt-2] + arr[cnt-3]);
    }
}