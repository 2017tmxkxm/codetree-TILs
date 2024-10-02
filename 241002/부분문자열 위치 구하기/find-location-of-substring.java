import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.contains(str2)) {
            int startIdx = str1.indexOf(str2);
            System.out.println(startIdx);
        } else {
            System.out.println(-1);
        }

    }
}