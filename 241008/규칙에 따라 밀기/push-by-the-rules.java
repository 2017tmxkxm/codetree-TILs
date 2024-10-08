import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String command = sc.next();

        for(int i=0; i<command.length(); i++) {
            if(command.charAt(i) == 'L') {
                A = A.substring(1) + A.charAt(0);
            }else {
                A = A.substring(A.length()-1) + A.substring(0, A.length()-1);
            }
        }

        System.out.println(A);
    }
}