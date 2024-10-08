import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while(true) {
            int n = sc.nextInt();

            int len = str.length();

            if(n >= str.length()) {
                str = str.substring(0, len-1);
                System.out.println(str);
            } else {
                str = str.substring(0, n) + str.substring(n + 1, len);
                System.out.println(str);
            }

            if(str.length() == 1) {
                break;
            }
        }
    }
}