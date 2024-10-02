import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int qs = sc.nextInt();

        for(int i=0; i<qs; i++) {
            int q = sc.nextInt();

            if(q==1) {
                int a = sc.nextInt()-1;
                int b = sc.nextInt()-1;

                char temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

                for(char c : arr) {
                    System.out.print(c);
                }
            } else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for(int j=0; j<arr.length; j++) {
                    if(arr[j] == a) {
                        arr[j] = b;
                    }
                }
                for(char c : arr) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }

    }
}