import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aA = sc.nextInt();
        int aG = sc.next().charAt(0);

        int bA = sc.nextInt();
        int bG = sc.next().charAt(0);

        if((19<=aA && aG == 'M') || (19<=bA && bG == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}