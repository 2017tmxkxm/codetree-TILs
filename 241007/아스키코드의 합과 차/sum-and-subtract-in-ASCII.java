import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int temp1 = (int) a;
        int temp2 = (int) b;

        System.out.print(temp1 + temp2 + " ");
        if(temp1 > temp2) {
            System.out.println(temp1- temp2);
        }else{
            System.out.println(temp2-temp1);
        }
    }
}