/*
import java.lang.*;
import java.util.*;*public class Solution {
    public int solve(int A) {
        int count = 0;
        for(int i=1 ; i<=A ; i++){
            int factors = 0;
            for(int j=1;j<=i;j++) {
                if(i%j==0){
                    factors++;
                }
            }
            if(factors==2) {
                count++;
            }
        }
        return count;
    }
}*/

/* public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();          
        int ans = 1;
        for(int i=1;i <= Math.min(a, b);i++) {
            if(a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        System.out.print(ans);
   }
}*/
/*Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int m = Math.max(a,b);

        for(; true ; m++){
            if(m % a == 0 && m % b == 0) {
                break;
            }
        }
        System.out.print(m);*/

       /* public class Solution {
    public int solve(int A) {
         int x = (int) Math.sqrt(A);
        if (x*x == A){
            return 1;
        }
         return 0;
    }
}*/
/*public class Solution {
    public int power(final int A, final int B) {
        int ans = 1;
        for (int i = 1; i <= B;i++){
            ans =ans * A;
        }
        return ans; 
        

    }
}*/

