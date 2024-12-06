public class Solution {

    public int solve(int A) {
        int cnt = 0;
        for(int i=1 ; i<=A ; i++){
            int factors = 0;
            
            for(int j=1;j<=i;j++) {
                if(i%j==0){
                    factors++;
                }
            }
            if(factors==2) {
                cnt++;
            }
        }
        return cnt;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();          
        int answer = 1;
        for(int i=1;i <= Math.min(a, b);i++) {
            if(a % i == 0 && b % i == 0) {
                answer = i;
            }
        }
        System.out.print(answer);
    }
}

public class Main {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int M = Math.max(A,B);
        for(; true ; M++){
            if(M % A == 0 && M % B == 0) {
                break;
            }
        }
        System.out.print(M);
    }
}


public class Solution {
    public int solve(int A) {
        int x = (int) Math.sqrt(A);
        if (x*x == A){
            return 1;
        }
         return 0;
    }
}


public class Solution {
    public int power(final int A, final int B) {
        int ans = 1;
        for (int i = 1; i <= B;i++){
            ans =ans * A;
        }
        return ans;
    }
}



