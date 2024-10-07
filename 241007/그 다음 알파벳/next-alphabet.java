import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int temp = (int) a;

        if(a=='z') System.out.println('a');
        else System.out.println((char) (temp + 1));

    }
}