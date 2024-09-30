import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        char temp = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(temp == arr[i]) {
                cnt++;
            }else {
                sb.append(arr[i-1]).append(cnt);
                temp = arr[i];
                cnt = 1;
            }

        }

        int test = arr.length-1;
        sb.append(arr[test]).append(cnt);
        System.out.println(sb.length());
        System.out.println(sb);
    }
}