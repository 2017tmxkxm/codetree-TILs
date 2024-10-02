import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        char c = arr[1];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == c) {
                arr[i] = arr[0];
            }
        }

        for(char a : arr) {
            System.out.print(a);
        }
    }
}