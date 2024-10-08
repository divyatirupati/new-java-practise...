public class Solution {
    public int solve(int[] A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        for(int i = 0; i < A.length; i++){
            int ele = A[i];
            int req = B-ele;
            if(map.containsKey(req)){
                if(ele == req){
                    if(map.get(req) >=2) return 1;
                } else {
                    return 1;
                }
            }
        }
        return 0;
    }
}

public class Solution {
    public String[] fizzBuzz(int A) {
        String[] res = new String[A];
        for(int i = 1; i <= A; i++ ){
            if(i%3 == 0 && i%5 == 0) res[i-1] = "FizzBuzz";
            else if(i%3 == 0) res[i-1] = "Fizz";
            else if(i%5 == 0) res[i-1] = "Buzz";
            else res[i-1] = ""+i;
        }
        return res;
    }
}

module.exports = { 
 //param A : array of integers
 //return an integer
    solve : function(A){
        let max = A[0]
        let n = A.length
        for(let i=1;i<n;i++){
            if(A[i]>max){
                max = A[i]
            }
        }
        let sec = 0;
        for(let i=0;i<n;i++){
            let diff = max-A[i];
            sec = sec+diff
        }
        return sec
    }
};


