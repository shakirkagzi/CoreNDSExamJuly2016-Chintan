package math;
import java.util.*;
/**
 * Created by Shakir on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.print("Input the Positive no. to Find the Factorial of that no. :");
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        int c, fact = 1;
        if ( input < 0 )
            System.out.println("Number should be non-negative.");
        else
        {
            for ( int i = 1 ; i <= input ; i++ )
                fact = fact*i;

            System.out.println("Factorial of "+input+" is = "+fact);
        }
    }
}
