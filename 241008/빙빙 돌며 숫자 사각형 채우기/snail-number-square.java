import java.util.Scanner;

public class Main {
    // 행, 열
    static int n,m;

    // 시작 위치
    static int x = 0, y = 0;

    // 진행 방향 -> 0 : 오른쪽, 1 : 아래쪽, 2 : 왼쪽, 3 : 위쪽
    static int dir = 0;
    static int[] dx = new int[] {0, 1, 0, -1};
    static int[] dy = new int[] {1, 0, -1, 0};

    // 범위 안에 위치하는지 확인
    static boolean inRange(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];
        arr[x][y] = 1;

        for(int i=2; i<=n*m; i++) {
            // 현재 방향 dir를 기준으로 다음 위치 값을 계산 ex) (0, 1)
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 범위 안에 위치 하지 않거나, 0이 아닌 값이 채워져 있을 때 방향 전환
            if(!inRange(nx, ny) || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;
            }

            // 다음 위치로 이동한 다음 값 채우기 ex) x = 0, y = 1
            x = x + dx[dir];
            y = y + dy[dir];

            arr[x][y] = i;
        }

        // 출력
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}