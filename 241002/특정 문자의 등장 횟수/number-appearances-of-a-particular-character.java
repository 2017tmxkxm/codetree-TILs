import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                count1++;
            }
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'b') {
                count2++;
            }
        }

        System.out.println(count1 + " " + count2);

    }
}