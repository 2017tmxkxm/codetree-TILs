import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputStr = sc.next();
        String targetStr = sc.next();

        int inputLen = inputStr.length();
        int targetLen = targetStr.length();
        int count = 0;
        boolean exist = false;

        for(int i = 0; i < inputLen; i++) {
            for(int j=0; j<targetLen; j++) {
                if(inputStr.charAt(i+j) != targetStr.charAt(j)){
                    break;
                }
                exist = true;
                count++;
            }

        }

        System.out.println(count/targetLen);
    }
}