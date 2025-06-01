package shortest;

import java.util.LinkedList;
import java.util.Queue;

public class Itm {

    private static final int[] dRow = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static final int[] dCol = {1, 2, 2, 1, -1, -2, -2, -1};

    public int minKnightMoves(int N, int M, int R, int C, int S, int K) {
        boolean[][] visited = new boolean[N + 1][M + 1];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{R, C, 0});
        visited[R][C] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int moves = current[2];

            if (row == S && col == K) {
                return moves;
            }

            for (int i = 0; i < 8; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                if (newRow >= 1 && newRow <= N && newCol >= 1 && newCol <= M && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.add(new int[]{newRow, newCol, moves + 1});
                }
            }
        }

        return -1;
    }
}
