import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt = 0;

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) {
                break;
            }
            cnt++;
        }

        for(int i=1; i<=cnt; i++) {
            if(arr[cnt-i] != 0) {
                System.out.print(arr[cnt-i] + " ");
            }
        }
    }
}