import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>=3000) System.out.println("book");
        else if(1000<=a && a<3000) System.out.println("mask");
        else System.out.println("no");
    }
}