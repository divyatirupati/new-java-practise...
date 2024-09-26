// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  public static void main(String[] args) {
    System.out.println(20+45+53);
      System.out.println("Hello, World!");
      Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i <= n ;i++ ){
           
                System.out.print(i + " ");

                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }



        Scanner s = new Scanner(System.in);
         int N = s.nextInt();
         int sum = 0;
         int i = 1;
        while(i <= N) {
            sum += i;
            i++;
        }
        System.out.println(sum);



       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while(i <= n) {
            System.out.print(i + " ");
            i += 2;
        }


        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        while(n >= 1) {
            System.out.print(n + " ");
            n--;
        }



        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=4;
        while(i<=n){
            System.out.print(i +" ");
            i=i+4;
        }
  }
}