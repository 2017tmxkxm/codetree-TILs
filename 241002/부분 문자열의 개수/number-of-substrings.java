import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        String targetStr = sc.next();

        int inputLen = inputStr.length();
        int targetLen = targetStr.length();
        int result = 0;

        for(int i = 0; i < inputLen; i++) {
            int count = 0;
            for(int j=0; j<targetLen; j++) {
                if(inputStr.charAt(i+j) != targetStr.charAt(j)) {
                    break;
                }
                count++;
            }
            if(count == targetLen) result++;

        }

        System.out.println(result);
    }
}