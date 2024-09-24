import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxVal = -1;
        int[] arr1 = new int[n+1];
        int[] arr2 = new int[n+1];

        for(int i=1; i<n+1; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=1; i<n+1; i++) {
            arr2[arr1[i]]++;
        }

        for(int i=1; i<n+1; i++) {
            if(arr2[i]==1) {
                if(i>maxVal) {
                    maxVal = i;
                }
            }
        }

        if(maxVal==-1) {
            System.out.println(maxVal);
        }else {
            System.out.println(maxVal);
        }


    }
}