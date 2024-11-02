
public class Main {
  public static void main(String[] args) {
     /* Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b){
            System.out.println(a);
        }
            else {
                System.out.println(b);
            }

            Scanner scn = new Scanner(System.in);*/
		
		/*
		//Q.1. Given age of a person, is the person
		// eligible to vote ?
		
		int age = scn.nextInt();
		if(age >= 18){
			System.out.println("Eligible to vote");
		}else{
			System.out.println("Not Eligible");
		}
		*/
		
		/*
		Q.2 Given two numbers, find which is greater of those two.
		Ex: a = 7
			b = 5
			Output: 7 is greater
			
			a = 2
			b = 6
			Output: 6 is greater
			
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		
		
		if(a > b){
			System.out.println(a + " is greater");
		}else if(b > a){
			System.out.println(b + " is greater");
		}else{
			//equal 
			System.out.println("Both are equal");
		}
		*/
		
		/*
		Q.3. Given two numbers, print which one is smaller
		Ex: a = 4
			b = 7
			Output => 4 is smaller than 7
			
			a = 6
			b = 1
			Output => 1 is smaller than 6
		*/
		
		
		/*
		Q.4.Read the temperature(Fahrenheit) of a person 
		and print if he has fever,
		optimum tem or below optimum temperature.

		[98.2, 98.9] => optimum

		Ex: 101.5 => The person has Fever
		Ex: 96.9 => The person has a low temperature

		0,  98.2,....98.9,
		
		
		double temp = scn.nextDouble();
		
		if(temp > 98.9){
			System.out.println("You have fever");
		}else if(temp < 98.2){
			System.out.println("You have a low temperature");
		}else{
			System.out.println("You have optimum temperature");
		}
		*/
		
		/*
		Q.5. Read the SpO2 level of a person.
		Print if the person's oxygen level is 
		- normal [96-100]
		- Slighly below normal [90 - 95]
		- Alarmingly below normal <90
		
		
		int level = scn.nextInt();
		
		if(level < 90){
			System.out.println("Alarmingly low");
		}else if(level < 96){
			System.out.println("Slightly below normal");
		}else if(level < 101){
			System.out.println("Normal");
		}else{
			System.out.print("Incorrect level");
		}
		*/
		
		/*
		Arithmetic Operators =>
		+, -, *, /
		
		4 + 5
		4 - 5
		4 * 5
		4 / 5
		
		Given two no. a and b, what would be the remainder when you 
		divide a by b.
		
		Modulus => %. 
		a % b --> give me the remainder after a is divided by b
		
		15 / 5
		15 - 5 = 10
		10 - 5 = 5
		5 - 5 = 0  
		15 % 5 => 0 is your remainder.
		
		7 / 2
		7 - 2 = 5
		5 - 2 = 3
		3 - 2 = 1
		7 % 2 => 1 is your remainder.
		
		42 % 5 = 2
		170 % 10 = 0
		15 % 2 = 1
		55 % 1 = 0
		
		1.) If a is completely divisible by b then a % b will be 0.
		2.) a % b (remainder) will always be in the range [0, b - 1]
		
		
		System.out.println(a % b);
		// System.out.println(-5 % 6);
		
		
		4 % 8
		remainder is 4.
		
		7 % 21 = 7
		
		7 / 21
		remainder is 7
		7 - 21 = -14 -->wrong
		
		17 % 4 = 1
		*/
		
		/*
		Q.6.Given a number. Print true if it is divisible by 4.
		Ex: 
		60 => true
		9 => false
		
		
		int x = scn.nextInt();
		
		if(x % 4 == 0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		*/
		
		/*
		Q.7. Given a number, check if it is odd or even.

		Ex: 
		19 => odd
		22 => even
		
		Even --> divisible by 2
		Odd --> Not divisible by 2
		
		
		int x = scn.nextInt();
		
		if(x % 2 == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		*/
		
		// 10 / 0 --> Infinity
		// 0 / 0 --> Not defined
		
		// x / 0 --> Error(Arithmetic Exception)
	
		// System.out.print(10.0 / 0); //Infinity
		// System.out.print(10 / 0); //Error
		
		/*
		Q8[Amazon]: FizzBuzz
		Given a number, 
		print fizz if it divisible by 3, 
		print buzz if it is divisible by 5
		print fizz-buzz if it is divisible by both 3 and 5
		
		
		6 -> fizz
		5 -> buzz
		15 -> fizz-buzz
		
		
		AND --> cond1 && cond2
		--> It is true when both cond1 and cond2 are true
		--> otherwise it is false
		
		OR --> cond1 || cond2 
		--> It is true when either cond1 or cond2 or both is true
		--> otherwise it is false
						
		int x = scn.nextInt();
		// lcm of 3 and 5 = 15 if(x % 15 == 0)
		
		if(x % 3 == 0 && x % 5 == 0){
			System.out.println("FizzBuzz");
		}else if(x % 3 == 0){
			System.out.println("Fizz");
		}else if(x % 5 == 0){
			System.out.println("Buzz");
		}
		*/
		
		//System.out.println((float)17/5);
		
		
		// System.out.format("%.2f", ans);

   Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>0){
            System.out.println("1");
        }
          else if (n<0){
            System.out.println("-1");   
        } 
        else{
            System.out.println("0");
        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2!=0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        Scanner s = new Scanner(System.in);
        int A =s.nextInt();

        switch(A) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March");   break;
            case 4: System.out.println("April");   break;
            case 5: System.out.println("May");     break;
            case 6: System.out.println("June");    break;
            case 7: System.out.println("July");     break;
            case 8: System.out.println("August");  break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            
        }

        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        if(A>B&&A>C){
            System.out.println(A);
        }
        else if(B>A&&B>C){
            System.out.println(B);
        }
        else {
            System.out.println(C);
        }

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int D = s.nextInt();
        int E = s.nextInt();
         int p =(A+B+C+D+E)/5;
         System.out.println(p);
        if(p>=90)
        System.out.println("A");
        else if(p>=80)
         System.out.println("B");
        else if(p>=70)
        System.out.println("C");
        else if(p>=60)
        System.out.println("D");
        else if(p>=40)
        System.out.println("E");
        else if(p<40)
        System.out.println("F");

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if(A == B && B == C && C == A){
            System.out.println("equilateral");
        }
        else if(A == B || B == C || C == A){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");

        }

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        }
          else if(n % 3 == 0 ){
            System.out.println("Fizz");
        }
         else if( n % 5 == 0){
            System.out.println("Buzz");
        }

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        //int floor = A / B;
        System.out.println(A/B);nt B = s.nextInt();

         Scanner s=new Scanner(System.in);
        int A=s.nextInt();
        int B=s.nextInt();
        int C=s.nextInt();
        if(A<B && A<C)
        System.out.print(A);
        else if(B<A && B<C)
        System.out.print(B);
        else
        System.out.print(C);

        Scanner s=new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        if(A+B+C==180)
        System.out.print("1");
        else
        System.out.print("0");

        Scanner s=new Scanner(System.in);
        int A=s.nextInt();
         if(A%5==0 && A%11==0)
         System.out.println(1);
         else 
         System.out.println(0); 

          Scanner s = new Scanner(System.in);
        int C = s.nextInt();
        int S = s.nextInt();
        if(C > S){
            System.out.println(-1);
            System.out.print(C - S);
        }
        else{
            System.out.println(1);
            System.out.print(S - C);
        }

        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2==1){
            if(n >= 2100)
                System.out.print("grand master");
            else if(n >= 1900)
                System.out.print("candidate master");
            else if(n >= 1600)
                System.out.print("expert");
            else if(n >= 1400)
                System.out.print("pupil");
            else 
                System.out.print("newbie");
        }
        else{
            if(n >= 2100)
                System.out.print("GRAND MASTER");
            else if(n >= 1900)
                System.out.print("CANDIDATE MASTER");
            else if(n >= 1600)
                System.out.print("EXPERT");
            else if(n >= 1400)
                System.out.print("PUPIL");
            else 
                System.out.print("NEWBIE");
        }
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        switch(A){
            case 1: System.out.print("31");
             break;                                 
            case 2: System.out.print("28");
             break;
            case 3: System.out.print("31");
             break;
            case 4: System.out.print("30");
             break;
            case 5: System.out.print("31");
             break;
            case 6: System.out.print("30");
             break;
            case 7: System.out.print("31"); 
            break;
            case 8: System.out.print("31");
             break;
            case 9: System.out.print("30");
             break;
            case 10: System.out.print("31");
             break;
            case 11: System.out.print("30");
             break;
            case 12: System.out.print("31");
             break;
        }
           
           
        
  }
}