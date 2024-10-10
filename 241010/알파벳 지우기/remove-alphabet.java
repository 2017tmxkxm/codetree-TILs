import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String temp1 = "";
        String temp2 = "";

        for(int i=0; i<a.length(); i++) {
            if('0' <= a.charAt(i) && a.charAt(i) <= '9') {
                temp1 += a.charAt(i);
            }
        }

        for(int i=0; i<b.length(); i++) {
            if('0' <= b.charAt(i) && b.charAt(i) <= '9') {
                temp2 += b.charAt(i);
            }
        }

        System.out.println(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }
}