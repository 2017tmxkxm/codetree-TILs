import java.util.Scanner;

public class Main {
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b; i++) {
            if(i%6==0 && i%8!=0) {
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}