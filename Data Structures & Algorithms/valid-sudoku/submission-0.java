class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r<9;r++){
            for(int c = 0; c<9;c++){
                if(board[r][c] != '.'){
                    char curr = board[r][c];
                    for(int i = 0 ;i<9;i++){
                        if(i != c && board[r][i] == curr) return false;
                        if(i != r && board[i][c] == curr) return false;
                        int boxrow = 3 * ( r/ 3) + i / 3;
                        int boxcol = 3 * (c / 3) + i % 3;
                        if((boxrow != r || boxcol != c) && board[boxrow][boxcol] == curr){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
