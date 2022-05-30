class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0) return new int[0];
        int m=mat.length;
        int n=mat[0].length;
        int r=0;
        int c=0;
        int i=0;
            int result[] = new int[m*n];
        while(i<result.length){
            result[i]=mat[r][c];
            if((r+c)%2==0){
                //even
                if(c==n-1){
                    r++;
                }else if(r==0){
                    c++;
                }else{
                    r--;
                    c++;
                }
                
            }else{
                //odd
                if(r==m-1){
                    c++;
                }else if(c==0) {
                    r++;
                }else{
                    r++;
                    c--;
                }
                
            }
            
            
            i++;
        }

        return result;
        
    }
}