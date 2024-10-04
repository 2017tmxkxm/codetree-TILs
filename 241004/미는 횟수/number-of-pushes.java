import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int cnt = 0;

        while(true) {
            A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
            cnt++;
            if(A.equals(B)) {
                break;
            }
        }

        System.out.println(cnt);
    }
}