/*public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int power(final int A, final int B) {
        int ans = 1;
        for (int i = 1; i <= B;i++){
            ans *= A;
        }
        return ans; 
        

    }
}*/
/* import java.lang.Math;
 
public class Main {
    public static void main(String args[])
    {
        double a = 3;
        double b = 3;
        System.out.println(Math.pow(a, b));
    }
}*/
 /*class Solution {
    public int power(final int A, final int B) {
        int ans = 1;
        for (int i = 1; i <= B;i++){
            ans =ans * A;
        }
        return ans; 
        

    }
}
public class Main {
  class Solution {
    public int power(final int A, final int B) {
      int a = 2;
      int b = 3;
        int ans = 1;
        for (int i = 1; i <= B;i++){
            ans =ans * A;
        }
        return ans; 
        

    }
}

    public static void main(String args[])
    {
       
    }
}*/
/* import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int m = Math.max(a,b);

        for(; true ; m++){
            if(m % a == 0 && m % b == 0) {
                break;
            }
        }
        System.out.print(m);
    }
}*/