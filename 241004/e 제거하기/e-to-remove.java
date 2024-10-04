import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char c = 'e';

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                System.out.println(str.substring(0, i) + str.substring(i+1, str.length()));
                break;
            }
        }
    }
}