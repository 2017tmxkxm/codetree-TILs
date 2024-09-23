import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int index = -1;

        int[] arr = new int[n + 1];
        for(int i=1; i<n+1; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<q+1; i++) {
            int temp1 = sc.nextInt();
            int temp2 = sc.nextInt();

            if(temp1==1) {
                System.out.println(arr[temp2]);
            } else if (temp1==2) {
                for(int j=1; j<n+1; j++) {
                    if(arr[j]==temp2) {
                        index = j;
                        break;
                    }
                }
                if(index==-1) {
                    System.out.println(0);
                }else {
                    System.out.println(index);
                }
            } else {
                int temp3 = sc.nextInt();
                for(int j=temp2; j<=temp3; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}