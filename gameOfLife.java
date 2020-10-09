class Solution {
    public void gameOfLife(int[][] board) {

         if (board == null || board.length == 0)
            return;

         int n = board.length;
        int m = board[0].length;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                int alive = countNeighboursAlive(board,i,j,n,m);

                if(board[i][j] == 1 && (alive<2 || alive>3)){
                    board[i][j]=4;
                }
                else if(board[i][j] == 0 && alive==3){
                    board[i][j]=2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 4)
                    board[i][j] = 0;
                else if (board[i][j] == 2)
                    board[i][j] = 1;
            }
        }

    }

    private int countNeighboursAlive(int[][] board, int i, int j, int n, int m){

        int[][] dirs = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
        int count = 0;

        for( int[] ss : dirs){
            int r = i + ss[0];
            int s = j + ss[1];

            if(r >= 0 && r < n && c >= 0 && c < m && (board[r][s] == 1 || board[r][s]==4) ){
                count++;
            }
        }

        return count;
    }
}