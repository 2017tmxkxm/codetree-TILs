import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        char c1 = arr[0];
        char c2 = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == c1) arr[i] = c2;
            else if (arr[i] == c2) {
                arr[i] = c1;
            }
        }

        for(char c : arr) {
            System.out.print(c);
        }
    }
}