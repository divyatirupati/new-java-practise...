public class Solution{
    public double solve(int a){
        double pi=3.1416;
        double area = pi*a*a;
        return Math.round(area*100.0)/100.0;
    }
}
public class Solution {
    public int solve(int a, int b, int c) {
        return Math.min(a/b,c);
    }
}
public class Solution {
    public int solve(int A, int B) {
       return (B+(3*A))/2;
    }
}
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int  sum = 0;
        for(int i = 1; i <= A ; i++){
            if(i % 2 == 0){
                 sum =  sum + i;
            }
        }
        System.out.println(sum);
    }
}
public class Solution {
    public int solve(final int A) {
       double PI = Math.acos(-1);
        int V = (int)Math.ceil((4.00 * PI * A * A * A) / (double)3.0);
        return V; 
    }
}
