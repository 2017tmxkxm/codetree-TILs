import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[11];
        int[] newArr = new int[7];

        for(int i=1; i<=10; i++) {
            arr[i] = sc.nextInt();
            newArr[arr[i]]++;
        }

        for(int i=1; i<=6; i++) {
            System.out.println(i + " - " + newArr[i]);
        }
    }
}