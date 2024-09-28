import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int max = 1;
        int min = 20;

        if(len1> max && len1> len2 && len1 > len3) {
            max = len1;
        } else if(len2 > max && len2 > len1 && len2 > len3) {
            max = len2;
        } else {
            max = len3;
        }

        if(len1 < min && len1 < len2 && len1 < len3) {
            min = len1;
        } else if(len2 < min && len2 < len1 && len2 < len3) {
            min = len2;
        } else {
            min = len3;
        }

        System.out.println(max-min);

    }
}