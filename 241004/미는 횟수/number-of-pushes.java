import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int cnt = 0;

        while(true) {
            if(cnt < A.length()) {
                A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
                cnt++;
            } else {
                System.out.println(-1);
                break;
            }

            if(A.equals(B)) {
                System.out.println(cnt);
                break;
            }
        }
    }
}