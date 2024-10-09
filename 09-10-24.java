
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cnnt = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                cnnt++;
            }

        }
        System.out.print(cnnt);

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int cnnt = 0;
        for(int i = 1 ; i <= A ; i++ ){
        if(A % i == 0){
        cnnt++;
         }
        }
        if(cnnt > 2){
        System.out.println("NO");
        }
        else{
        System.out.println("YES");

        }

        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int sum = 0;
            for(int i = 1; i < n ; i++){
                if(n % i == 0){
                    sum += i ;
                }
            }
            if(sum  == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");

            }
        }
        
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
           
            System.out.print("*");
        }
       

       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for(int i=1;i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            
             for (int j = 1; j <= i; j++) {
                
                if ((j % 2) == 1)
                    System.out.print(j);
              
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 2 ; i <= n ; i++){
            boolean PRIME = true;
            for(int x = 2 ; x < i ; x++) {
                if(i % x == 0) {
                    PRIME = false;
                    break;
                }
            } 
            if(PRIME == true) {
                System.out.println(i);
            }
        } 

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 1; i <= N; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
                if (j != i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
         for(int i = 0; i < n; i++){
        
            for(int j = 0; j < n-i; j++){

                System.out.print("*");
            }
            System.out.println();
        }

         Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print('*');
            
            for (int j = 1; j < N - 1; j++) {

              System.out.print(' ');
            }
              System.out.print("*\n");
        }
      System.out.println("Hello, World!");
  }
}