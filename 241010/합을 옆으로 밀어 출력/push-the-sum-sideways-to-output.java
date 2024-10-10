import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for(int i=0; i<n; i++) {
            int temp = sc.nextInt();
            sum += temp;
        }

        String temp = Integer.toString(sum);

        System.out.println(temp.substring(1) + temp.charAt(0));
    }
}