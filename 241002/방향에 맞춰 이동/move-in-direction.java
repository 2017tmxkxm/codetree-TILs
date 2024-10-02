import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 순서대로 동, 서, 남, 북
        int[] dx = new int[] {1, -1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};

        int x =0;
        int y = 0;

        for(int i=0; i<n; i++) {
            char c = sc.next().charAt(0);
            int a = sc.nextInt();

            int dir;
            if(c == 'E') {
                dir = 0;
            } else if (c == 'W') {
                dir = 1;
            } else if(c == 'S') {
                dir = 2;
            } else {
                dir = 3;
            }

            x += dx[dir] * a;
            y += dy[dir] * a;

        }

        System.out.println(x + " " + y);
    }
}