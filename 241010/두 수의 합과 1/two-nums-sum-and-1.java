import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String temp = Integer.toString(a+b);

        int cnt = 0;

        for(int i=0; i<temp.length(); i++) {
            if(temp.charAt(i) == '1') {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}