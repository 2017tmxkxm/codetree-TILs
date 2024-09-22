import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();
        int cnt = 0;
        int cnt2= 0;

        // 배열 선언
        int[] num = new int[100];

        for(int i=n; i<100; i+=n) {
            num[cnt++] = i;
            if(i%5==0) {
                cnt2++;
                if(cnt2==2) {
                    break;
                }
            }
        }

        for(int i=0; i<cnt; i++) {
            System.out.print(num[i] + " ");
        }
    }
}