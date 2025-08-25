
public class Main {
  public static void main(String[] args) {
     /*public class Solution {
    public int[] solve(int[] A, int B) {
        int n = A.length;
        long preSum = A[0];
        for(int i = 1;i < n; i++){
            preSum+=A[i];
            if(preSum == B){
                
                int[] res = new int[i+1];
                for(int k = 0; k <= i;k++){
                    res[k] = A[k];
                } 
                return res;
            }
        }
        int[] pf = new int[n];
        pf[0] = A[0];
        for(int i = 1; i < n; i++){
            pf[i] = pf[i-1] + A[i];            
        }
        int i = 1, j = 1;
        while(j < n){
            int target = pf[j] - pf[i-1];
            if(target == B){
                int start = i;
                int end = j;
                int[] res = new int[end-start+1];
                int index = 0;
                for(int k = start; k <= end; k++){
                    res[index++] = A[k];
                }
                return res;
            } else if(target < B){
                j++;
            } else{
                i++;
                if(i==j){
                    j++;
                }
            }
        }
        return new int[]{-1};
    }
}*/
/*public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int i = 0, j = 1, count = 0;
        while(j < n){
            int diff = Math.abs(A[j]-A[i]);
            if(diff == B){
                int currJ = A[j];
                while(j < n && A[j] == currJ){
                    j++;
                }
                count++;
                i++;
            } else if(diff < B){
                j++;
            } else {
                i++;
                if(i == j) j++;
            }
        }
        return count;
    }
}
*/
  }
}