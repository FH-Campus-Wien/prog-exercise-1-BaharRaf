
package at.ac.fhcampuswien;

import java.util.Scanner;
public class App {
    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\" );
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");


    }

    //todo Task 3
    public void sumOfLiterals(){
        /*
        ’Z’ --> char
        0xface --> Hexa Decimal (Integral Literals)
        012 --> Octal Integer (Integral Literals)
        80L--> long
        44e-1f --> Decimal in Exponent form ( Floating Point Literals)
        5.5f, --> Floating (Floating Point Literals)
        8.88e1
        99.9 --> double
        */
        char z = 'Z';
        int h = 0xface;
        int o = 012;
        long l = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double q = 8.88e1;
        double d = 99.9;
        int sum = z + h + o + (int) l + (int) e +  (int) f + (int) q + (int) d;
        System.out.println(sum);

        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Before Swap:");
        System.out.print("x: "  );
        System.out.print("y: " );
        /* int swap = c;
        c = d;
        d = swap;*/
        c = c ^ d;
        d = c ^ d;
        c = c ^ d;

        System.out.println("After Swap:");
        System.out.println("x: " + c);
        System.out.println("y: " + d);

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        if ( n1 > n2 ){
            System.out.println("n1:" + " n2:" + " n1 > n2");
        } else if ( n2 > n1 ) {
            System.out.println("n1:" + " n2:" + " n2 > n1");
        }else {
            System.out.println("n1:" + " n2:" + " n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int r ;
        System.out.print("Enter annual Revenue: ") ;
        r= scanner.nextInt();
        if(0 <= r && r < 20000 ){
            System.out.println("Poor Sales Revenue");
        } else if (20000 <= r && r< 50000) {
            System.out.println("Average Sales Revenue");
        }else if (50000 <= r && r < 80000){
            System.out.println("Good Sales Revenue");
        } else if (80000 <= r && r < 100000) {
            System.out.println("Excellent Sales Revenue");
        }else{
            System.out.println("Invalid Revenue");
        }

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        int e = scanner.nextInt();
        //https://www.w3schools.com/java/java_switch.asp
        switch(e) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        System.out.print("Year: ");
        int y = scanner.nextInt();
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        System.out.print("Number: ");
        int n = scanner.nextInt();
        int m ;// m = Remainder
        int reverse = 0;

        if ( n < 1000) {
            while( n != 0){
             m = n % 10;
             reverse = reverse * 10 + m;
             n = n/10;
            }
            System.out.println(reverse);
         } else {
        System.out.println("The Number Can only be up to 3 Digits");
         }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}