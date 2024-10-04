import java.util.Scanner;

public class Main {
    // dx, dy 행, 열 기준으로 정의
    static int[] dx = new int[] {0, 1, 0, -1};
    static int[] dy = new int[] {1, 0, -1, 0};
    
    // 범위 지정
    static boolean inRange(int x, int y) {
        return (1<=x && x<=n && 1<=y && y<=n);
    }
    
    static int n;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        // 배열 받기
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // 인접한 곳 1 찾기
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int cnt = 0;
                // 상,하,좌,우 인접한 행,열 탐색
                for(int dir=0; dir<4; dir++) {
                    // ex) 1행 1열이고 dir=0 이라면
                    // nx = 1, ny = 2 -> 1행 2열 이런 식으로 상하좌우 탐색
                    int nx = i + dx[dir];
                    int ny = j + dy[dir];
                    if(inRange(nx, ny) && arr[nx][ny] == 1) {
                        cnt++;
                    }
                }
                // 인접한 곳의 1이 3개 이상일 경우 
                if(cnt >=3) result++;
            }
        }

        System.out.println(result);
        
    }
}