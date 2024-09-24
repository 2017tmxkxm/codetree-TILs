import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxVal = -1;
        int[] arr1 = new int[1001];
        int[] arr2 = new int[1001];

        for(int i=1; i<n+1; i++) {
            arr1[i] = sc.nextInt();
            arr2[arr1[i]]++;
        }

        for(int i=1; i<1001; i++) {
            if(arr2[i]==1) {
                if(i>maxVal) {
                    maxVal = i;
                }
            }
        }

        System.out.println(maxVal);


    }
}