
public class Main {
  public static void main(String[] args) {
    /*  public class Solution {
    public int solve(final int[][] A) {
        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum+=A[i][i];
        }
        return sum;
    }
}*/
/*public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int col0 = 1;
        for(int i = 0; i < n; i++){
            if(A[i][0] == 0) col0 = 0;
            for(int j = 1; j < m; j++){
                if(A[i][j] == 0){
                    A[i][0] = 0;
                    A[0][j] = 0;
                }
            }
        }
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j > 0; j--){
                if(A[i][0] == 0 || A[0][j] == 0){
                    A[i][j] = 0;
                }
            }
            if(col0 == 0) A[i][0] = 0;
        }
        return A;
    }
}*/
/* public class Solution {
    public int[] solve(int[][] A) {
        int n = A.length, m = A[0].length;
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = 0; j < m; j++){
                temp += A[i][j];
            }
            ans[i] = temp;
        }
        return ans;
    }
}*/

/*public class Solution {
   
    public int solve(final int[][] A) {
        int n = A.length;
        int sum = 0;
        
        for (int i = 0; i < n;i++){
            sum += A[i][n-1-i];
        }
        return sum;
    }
}*/

/*public class Solution {
    public int[][] solve(int[][] A, int B) {
        int row = A.length, col = A[0].length;
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                
                A[i][j] *= B;
        return A;
    }
}*/
/*public class Solution {
    public int solve(int[][] A, int[][] B) {
         int m=A.length;
        int n=A[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]!=B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}*/
     System.out.println("hi");





  }
}