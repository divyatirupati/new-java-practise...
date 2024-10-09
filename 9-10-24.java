public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        Arrays.sort(A);
        int ans = Integer.MAX_VALUE;
        // input might be 1 5 6. in this scenario, if you do A[0]-A[1] then its 4, but instead we have to 
        // check the minimum values for every adjecent element.
        for(int i=1;i<n;i++){
            ans = Math.min(ans,Math.abs(A[i]-A[i-1]));
        }
        return ans;
    }
}

public class Solution {
    public int[][] solve(int[] A, int[][] B) {
        int n = A.length;
        int[] pf0s = new int[n], pf1s = new int[n];
        pf0s[0] = A[0] == 0 ?1:0;
        pf1s[0] = A[0] == 1 ?1:0;
        for(int i = 1; i < n; i++){
            int ele = A[i];
            pf0s[i] = (ele == 0)?pf0s[i-1]+1:pf0s[i-1];
            pf1s[i] = (ele == 1)?pf1s[i-1]+1:pf1s[i-1];
        }
        int[][] res = new int[B.length][2];
        for(int i = 0; i < B.length; i++){
            int L = B[i][0]-1, R = B[i][1]-1; 
            res[i][0] = L == 0 ? (pf1s[R]%2 == 0 ? 0:1) : (pf1s[R]-pf1s[L-1])%2 ==0?0:1 ;
            res[i][1] = L == 0 ? (pf0s[R]) :pf0s[R]-pf0s[L-1];
        }
        return res;
    }
}

public class Solution {
 
    private int cntIndexesToMakeBalance(int arr[], int n)
    {
        if (n == 1) {
            return 1;
        }
     
        if (n == 2)
            return 0;
     
        int sumEven = 0;
        int sumOdd = 0;
     
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumEven += arr[i];
            }
            else {
                sumOdd += arr[i];
            }
        }
     
        int currOdd = 0;
        int currEven = arr[0];
        int res = 0;
        int newEvenSum = 0;
        int newOddSum = 0;
     
        for (int i = 1; i < n - 1; i++) {
            if (i % 2 == 1) {
                currOdd += arr[i];
                newEvenSum = currEven + sumOdd
                             - currOdd;
                newOddSum = currOdd + sumEven
                            - currEven - arr[i];
            }
            else {
                currEven += arr[i];
                newOddSum = currOdd + sumEven
                            - currEven;
                newEvenSum = currEven + sumOdd
                             - currOdd - arr[i];
            }
            if (newEvenSum == newOddSum) {
                res++;
            }
        }
        if (sumOdd == sumEven - arr[0]) {
            res++;
        }
        if (n % 2 == 1) {
            if (sumOdd == sumEven - arr[n - 1]) {
                res++;
            }
        }
        else {
            if (sumEven == sumOdd - arr[n - 1]) {
                res++;
            }
        }
        return res;
    }
 
    public int solve(int[] A) {
        int n = A.length;
        return cntIndexesToMakeBalance(A, n);
    }
}

