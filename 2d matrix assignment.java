
public class Main {
  public static void main(String[] args) {
    public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m ; j++){
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
}

public class Solution {
    public int[][] diagonal(int[][] A) {
        int n = A.length;
        int[][] res = new int[2*n-1][n];
        int newI =0;
        int newJ = 0;
        for(int j = 0; j < n; j++){
            int s = 0, e = j;
            newJ = 0;
            while(s < n &&  e >= 0){
                res[newI][newJ] = A[s][e];
                s++;
                e--;
                newJ++;
            }
            newI++;
        }
        for(int i = 1; i < n; i++){
            int s = i, e = n-1;
            newJ = 0;
            while(s < n && e >= 0){
                res[newI][newJ] = A[s][e];
                s++;
                e--;
                newJ++;
            }
            newI++;
        }
        return res;
    }
}

public class Solution {
    public int[] solve(int[][] A) {
    int n = A.length, m = A[0].length;
	int[] ans = new int[m];
    for(int j = 0; j < m; j++){
    	int temp = 0;
    	for(int i = 0; i < n; i++){
    		temp += A[i][j];
    	}
    	ans[j] = temp;
    }
    return ans;
    }
}

public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int r1 = A.length, c1 = A[0].length, r2 = B.length, c2 = B[0].length;
        int[][] res = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){ 
                for(int k = 0; k < c1; k++){
                    res[i][j] += (A[i][k] * B[k][j]);
                }                
            }
        }
        return res;
    }
}

public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;
        int[][] C = new int[N][M];
        for (int i = 0; i < N;i++){
            for (int j = 0; j < M;j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }
    
        return C;
    }
}


public class Solution {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] res = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                res[i][j] = A[j][i];
            }
        }
        return res;
    }
}
      
  }
}