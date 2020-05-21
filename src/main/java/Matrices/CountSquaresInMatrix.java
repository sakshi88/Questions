package Matrices;

public class CountSquaresInMatrix {

    private static int countSquares(int [][]matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        int count[] = new int[n];
        int result = 0, topleft=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    int top = (i==0) ? 0 : count[j];
                    int left = (j==0) ? 0 : count[j-1];
                    count[j] = 1 + Math.min(Math.min(top,left),topleft);
                    result += count[j];
                    topleft = (j==n-1) ? 0 : top;
                }
                else
                    count[j] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,0,1},{1,1,0},{1,1,0}};
        System.out.println("Count of squares with 1 is -" + countSquares(matrix));
    }
}
