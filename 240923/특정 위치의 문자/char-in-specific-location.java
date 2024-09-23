import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        int index = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == str) {
                index = i;
            }
        }

        if(index == -1) {
            System.out.println("None");
        } else {
            System.out.println(index);
        }
    }
}