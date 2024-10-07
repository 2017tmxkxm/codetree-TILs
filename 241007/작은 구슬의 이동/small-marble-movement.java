import java.util.Scanner;

public class Main {
    static int n, t, r, c;

    static int[] dx = new int[] {0, 1, -1, 0};
    static int[] dy = new int[] {1, 0, 0, -1};

    // 초기 구슬의 이동 방향
    static int getDir(char d) {
        if(d == 'R') {
            return 0;
        } else if (d == 'D') {
            return 1;
        } else if (d == 'U') {
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

            int nx = r + dx[moveDir];
            int ny = c + dy[moveDir];

            // 범위 안에 들어오면, 그 때 r과 c에 현재 위치 대입 및 그대로 진행
            if(inRange(nx,ny)) {
                r = nx;
                c = ny;
                // 범위 안에 들어오지 못하면, 방향을 전환
            } else {
                moveDir = 3 - moveDir;
            }

           
        }

        System.out.println(r + " " + c);
    }

}