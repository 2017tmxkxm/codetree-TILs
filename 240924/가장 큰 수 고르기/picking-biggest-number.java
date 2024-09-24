import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxVal = Integer.MIN_VALUE;

        for(int i=0; i<10; i++) {
            int n = sc.nextInt();
            if(n>maxVal) {
                maxVal = n;
            }
        }

        System.out.println(maxVal);
    }
}