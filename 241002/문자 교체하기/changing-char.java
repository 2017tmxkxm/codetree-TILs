import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String substring = str1.substring(0, 2);

        System.out.println(substring + str2.substring(2));

    }
}