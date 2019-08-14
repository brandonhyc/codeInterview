class Solution {
    public boolean exist(char[][] board, String word) {

        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        if (word == null || word.length() == 0) {
            return true;
        }

        boolean result = false;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[0].length; y++) {

                if (board[x][y] == word.charAt(0)) {
                    result = result || dfs(board, word, 0, x, y);
                }
            }
        }
        return result;
    }

    private boolean dfs(char[][] board, String word, int start, int ox, int oy) {

        if (start == word.length() - 1 && board[ox][oy] == word.charAt(start)) {
            // System.out.printf("char: %s\n", word.charAt(start));
            return true;
        }
        boolean result = false;

        int[] dx = { 1, 0, -1, 0 };
        int[] dy = { 0, 1, 0, -1 };
        // System.out.printf("start char: %s, at: (%d, %d)\n", word.charAt(start), ox,
        // oy);
        for (int i = 0; i < dx.length; i++) {

            int nx = ox + dx[i];
            int ny = oy + dy[i];

            if (!(0 <= nx && nx < board.length && 0 <= ny && ny < board[0].length)) {
                continue;
            }
            if (board[nx][ny] == word.charAt(start + 1)) {
                board[ox][oy] ^= 256;
                result = result || dfs(board, word, start + 1, nx, ny);
                board[ox][oy] ^= 256;

            }
        }

        return result;

    }
}