import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        for(int i=arr.length-1; i>=0; i--) {
            if(i%2==1) System.out.print(arr[i]);
        }

    }
}