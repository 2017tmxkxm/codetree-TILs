import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String ab = A + B;
        String ba = B + A;

        System.out.println(Integer.parseInt(ab) + Integer.parseInt(ba));
    }
}