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

        boolean answer = false;

        for(int i=0; i<B.length; i++) {
            for(int j=0; j<A.length; j++) {
                // B의 첫 번째 원소와 A의 원소가 같다면
                if(B[i] == A[j]) {
                    // A와 B의 배열을 벗어나면 안되기 때문에 조건을 설정해준 다음
                    if(j+1<n1 && i+1<n2) {
                        // 현재 A 배열의 다음 인덱스와 B의 다음 인덱스를 비교할 경우 같으면 true
                        if(A[j+1] == B[i+1]) {
                            answer = true;
                        }
                    }
                }
            }
        }

        // B의 배열이 A의 배열 길이를 벗어나지 않는다는 조건 추가 설정
        if(answer && B.length < A.length) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}