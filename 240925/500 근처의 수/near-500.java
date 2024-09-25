import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 1;
        int min = 1000;

        int[] arr = new int[10];

        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++) {
            if(arr[i] > 500) {
                if(arr[i] < min) {
                    min = arr[i];
                }
            }else {
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        System.out.println(max + " " + min);
    }
}