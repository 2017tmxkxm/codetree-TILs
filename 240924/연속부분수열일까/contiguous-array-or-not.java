import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i=0; i<n1; i++) {
            A[i] = sc.nextInt();
        }

        for(int i=0; i<n2; i++) {
            B[i] = sc.nextInt();
        }

        int index = 0;
        boolean answer = false;

        for(int i=0; i<B.length; i++) {
            for(int j=0; j<A.length; j++) {
                if(B[i] == A[j]) {
                    index = j;
                    if(index+1 <n1 && i+1<n2) {
                        if(A[index+1] == B[i+1]) {
                            answer = true;
                        }
                    }
                }
            }
        }

        if(answer) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}