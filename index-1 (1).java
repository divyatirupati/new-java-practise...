public class Solution {
    public int solve(final int A) {
       double PI = Math.acos(-1);
        int V = (int)Math.ceil((4.00 * PI * A * A * A) / (double)3.0);
        return V; 
    }
}
Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int  sum = 0;
        for(int i = 1; i <= A ; i++){
            if(i % 2 == 0){
                 sum =  sum + i;
            }
        }
        System.out.println(sum);
        public class Solution {
    public double solve(int A) {
       double PI = 3.1416;
        double area = PI * A * A;
        return Math.round(area * 100.0) / 100.0;
             
    }
}


