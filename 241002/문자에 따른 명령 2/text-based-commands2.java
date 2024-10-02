import java.util.Scanner;

public class Main {

    final static int[] dx = new int[] {1, 0, -1, 0};
    final static int[] dy = new int[] {0, -1, 0 ,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // 북쪽을 향한 상태
        int dirNum = 3;
        int x = 0;
        int y = 0;

        int nx = 0;
        int ny = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'E' ) {
                // 시계 방향
                dirNum = (dirNum +1) % 4;
            } else if (str.charAt(i) == 'L') {
                // 반시계 방향
                dirNum = (dirNum-1+4) % 4;
            } else {
                // F가 주어질 때 이동
                nx += x+dx[dirNum];
                ny += y+dy[dirNum];
            }
        }

        System.out.println(nx + " " + ny);
    }
}