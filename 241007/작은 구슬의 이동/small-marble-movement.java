import java.util.Scanner;

public class Main {
    static int n, t, r, c;

    static int[] dx = new int[] {0, 1, -1, 0};
    static int[] dy = new int[] {1, 0, 0, -1};

    // 초기 구슬의 이동 방향
    static int getDir(char d) {
        if(c == 'R') {
            return 0;
        } else if (c == 'D') {
            return 1;
        } else if (c == 'U') {
            return 2;
        } else {
            return 3;
        }
    }

    // x, y가 범위 안에 있는지 확인
    static boolean inRange(int x, int y) {
        return (1<=x && x<=n && 1<=y && y<=n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        r = sc.nextInt();
        c = sc.nextInt();

        char d = sc.next().charAt(0);
        int moveDir = getDir(d);

        for(int i=0; i<t; i++) {
            r += dx[moveDir];
            c += dy[moveDir];

            // 범위를 벗어난다면 방향 전환
            if(!inRange(r, c)) {
                moveDir = 3 - moveDir;
                i--;
            }
        }

        System.out.println(r + " " + c);
    }

}