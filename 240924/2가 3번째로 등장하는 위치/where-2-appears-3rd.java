import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i=1; i<n+1; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int i=1; i<n+1; i++) {
            if(arr[i]==2) {
                cnt++;
                if(cnt==3) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}