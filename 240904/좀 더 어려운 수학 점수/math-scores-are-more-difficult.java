import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aM = sc.nextInt();
        int aE = sc.nextInt();

        int bM = sc.nextInt();
        int bE = sc.nextInt();

        if(aM == bM && aE < bE) System.out.println('B');
        else if (aM == bM && aE > bE) System.out.println('A');
        else if (aM < bM) System.out.println('B');
        else System.out.println('A');
    }
}