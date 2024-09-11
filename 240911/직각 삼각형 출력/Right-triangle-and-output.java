import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 1;

        for(int i = a; i >= 1; i--) {

            for(int j = 1; j <= sum; j++) {
                System.out.print("*");
            }

            sum += 2;
            System.out.println();

        }

    }
}