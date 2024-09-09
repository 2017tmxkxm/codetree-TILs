import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int mul = 1;
        int cnt = 0;
        while(true) {
            int temp = mul*=2;
            cnt++;
            if(N==temp){
                System.out.println(cnt);
                break;
            }
        }
    }
}