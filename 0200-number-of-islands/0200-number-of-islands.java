class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int row=0; row <grid.length; row++){
            for (int col=0; col<grid[row].length; col++){
                if (grid[row][col] == '1'){
                    count++;
                    dfs(grid, row, col);
                }
            }
        }
        return count;
    }

    private void dfs (char [][] grid, int r, int c){
        int row = grid.length;
        int col = grid[0].length;

        // Base case
        if (r <0 || c <0 || r>=row || c >=col || grid[r][c] == '0'){
            return;
        }

        grid [r][c] = '0';
        dfs(grid, r+1, c);
        dfs(grid, r-1, c);
        dfs(grid, r, c+1);
        dfs(grid, r, c-1);
    }
}