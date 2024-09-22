import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int[] arr = new int[100];

        for(int i=0; i<100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==1 && arr[i]!=0) {
                arr[i] += 3;
                cnt++;
            }else if(arr[i]%2==0 && arr[i]!=0){
                arr[i] /= 2;
                cnt++;
            } else {
                break;
            }

        }

        for(int i=0; i<cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}