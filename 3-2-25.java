import java.util.*;
public class Main {
  public static void main(String[] args) {
     /* Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int count = 0;
        for(int i = 1 ; i <= A ; i++ ){
        if(A % i == 0){
        count++;
         }
        }
        if(count == 2){
        System.out.println("p");
        }*/
        
  

// optimization
// a number n is a prime number if it has no factors from 2 to sqrt(n)

  Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int count = 0;
        if(A == 1){
          System.out.println("no");
        }
        for(int i = 1 ; i <= Math.sqrt(A) /* i*i<= A*/; i++ ){
        if(A % i == 0){
        count++;
         }
        }
        if(count > 2){
        System.out.println("NO");
        }
        else{
        System.out.println("YES");

        }
        
        // sum of 1st n natural num = n(n+1)/2
        //sum of 1st n whole num = n(n-1)/2
        
  }
  }
