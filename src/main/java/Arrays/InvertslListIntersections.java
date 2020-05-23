package Arrays;

import java.util.ArrayList;
import java.util.List;

public class InvertslListIntersections {
    private static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi)
                ans.add(new int[]{lo, hi});

            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        int A[][] = {{0,2},{5,10},{13,23},{24,25}};
        int B[][] = {{1,5},{8,12},{15,24},{25,26}};
        int c[][] = intervalIntersection(A,B);
        for(int i=0;i<c.length;i++) {
            System.out.print("{");
            for (int j = 0; j < c[i].length; j++)
                System.out.print(c[i][j] +",");
            System.out.print("}");
            System.out.println();
        }
    }
}
