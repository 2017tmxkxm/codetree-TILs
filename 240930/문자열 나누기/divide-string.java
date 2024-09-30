import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";

        for(int i=0; i<n; i++) {
            str += sc.next();
        }

        for(int i=0; i<str.length(); i+=5) {
            if(i+5>str.length()) System.out.println(str.substring(i));
            else System.out.println(str.substring(i, i+5));
        }
    }
}