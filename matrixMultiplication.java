class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        int m = mat1[0].length;
        int l = mat2.length;
        int e = mat2[0].length;
        int multiply[][] = new int[n][e];
        for(int i = 0 ; i < multiply.length ; i++){
            for(int j = 0 ; j < multiply[0].length ; j++){
                 
               for(int f = 0  ; f < l ; f++){
                   multiply[i][j]+= mat1[i][f]*mat2[f][j];
               } 
            }
        }
        return multiply;
    }
}