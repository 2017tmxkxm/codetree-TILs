import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] countArr = new int[10];

        int sum = 0;

        while(true) {
            if(a<2) {
                break;
            }
            int temp = a%b;
            a=a/b;
            countArr[temp]++;
        }

        for(int i=0; i<countArr.length; i++) {
            sum += countArr[i] * countArr[i];
        }

        System.out.println(sum);
    }
}