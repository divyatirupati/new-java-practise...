// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int A = s.nextInt();
         int sum = 0;
        for(int i = 1;  i<= A ; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        System.out.print(sum);
      

      Scanner s = new Scanner(System.in);
         int A = s.nextInt();
         int B = s.nextInt();
         int sum = 1;
        for (int i = 1; i <= B;i++){
            sum *= A;
        }
        
        System.out.print(sum);

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println("5 * "+i+" = "+ N*i);
            i++;
        }


        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        
        int sum = 0;
        for(int i = 1 ; i <= A ; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.print(sum);

        
  }
}