import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[10];

        for(int i=0; i<10; i++) {
            char n = sc.next().charAt(0);
            arr[i] = n;
            if(i==1 || i==4 || i==7) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}