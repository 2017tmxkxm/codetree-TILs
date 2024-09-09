import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=3; i++) {
            int a = sc.nextInt();

            if(a%2!=0 && a%3==0) {
                continue;
            }else {
                System.out.println(a/2);
            }
        }
    }
}