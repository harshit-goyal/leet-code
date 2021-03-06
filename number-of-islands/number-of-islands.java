class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int count = 0;
        int i=0;
        while(i<grid.length){
            int j=0;
            while(j<grid[i].length){
                if(grid[i][j]=='1') count=count+dfs(grid,i,j);
                j++;
            }
            i++;
        }
        return count;
    }
    public static int dfs(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return 0;
        grid[i][j]='0';
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        dfs(grid,i+1,j);
        
       
        dfs(grid,i-1,j);
      
        return 1;
    }
}