import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        while(true) {
            int n = sc.nextInt();

            if(n==999 || n==-999) {
                break;
            }
            if (n>maxVal) {
                maxVal = n;
            }
            if(n<minVal) {
                minVal = n;
            }
        }

        System.out.println(maxVal + " " + minVal);
    }
}