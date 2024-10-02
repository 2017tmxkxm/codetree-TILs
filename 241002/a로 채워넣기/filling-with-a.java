import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();

        array[1] = 'a';
        array[array.length-2] = 'a';

        for (char c : array) {
            System.out.print(c);
        }

    }
}