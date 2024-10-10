import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String temp = Integer.toString(n);

        int sum = 0;

        for(int i=0; i<temp.length(); i++) {
            sum += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }

        System.out.println(sum);
    }
}