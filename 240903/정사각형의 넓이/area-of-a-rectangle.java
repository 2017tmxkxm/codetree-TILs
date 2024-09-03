import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = a*a;

        System.out.println(b);

        if(a < 5) System.out.println("tiny");
    }
}