import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 5) System.out.println('A');
        else if(n%2 ==0) System.out.println('B');
       
    }
}