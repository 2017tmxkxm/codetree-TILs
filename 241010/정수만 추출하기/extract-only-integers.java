import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        String temp1 = "";
        String temp2 = "";


        for(int i=0; i<A.length(); i++) {
            if(Character.isDigit(A.charAt(i))) {
                temp1 += A.charAt(i);
            } else {
                break;
            }
        }

        for(int i=0; i<B.length(); i++) {
            if(Character.isDigit(B.charAt(i))) {
                temp2 += B.charAt(i);
            } else {
                break;
            }
        }

        System.out.println(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }
}