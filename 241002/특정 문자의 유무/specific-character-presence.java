import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(str.contains("ee")) System.out.print("Yes ");
        else System.out.print("No ");

        boolean exists = false;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') {
                exists = true;
            }
        }

        if(exists) System.out.println("Yes");
        else System.out.println("No");

    }
}