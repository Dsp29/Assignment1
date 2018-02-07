//David St. Pierre at Trent University ID:0606058 February 7, 2018 Assignment 1 COIS 2240.
//I used much of the code in this link as a foundation for my program. 
//https://stackoverflow.com/questions/21710756/recursion-vs-iteration-fibonacci-sequence
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Prompting the user to enter the last element of the Fibonacci sequence. And storing it as as an integer n.
        System.out.print("Enter the last element of Fibonacci sequence: ");
        int n = sc.nextInt();

        //Print out iteration method with a timer as well. 
        System.out.println("Fibonacci iteration:");
        long start = System.currentTimeMillis();
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fiboSeriesIte(n));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);

        //Print out recursive method with a timer as well. 
        System.out.println("Fibonacci recursion:");
        start = System.currentTimeMillis();
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fiboSeriesRec(n));
        System.out.printf("Time: %d ms\n", System.currentTimeMillis() - start);
    }

    //Iteration method
    static long fiboSeriesIte(long n) 
    {
    	//Initializing of long x, y and z. x=0, y and z =1.
        long x = 0, y = 1, z = 1;
        //For loop iterates until it reaches the value of n.
        for (int i = 0; i < n; i++) 
        {
        	//Inside the for loop x equals the value of y, y equals the value of z, then z equals the value of x plus y.
            x = y;
            y = z;
            z = x + y;
        }
        //Return x after the for loop has iterated. 
        return x;
    }

    //Recursive method
    static long fiboSeriesRec(long  n) 
    {
    	//If statement checks to see if n is equal to 1 or 0. If it is, it returns n thus ending the recursive function.
        if ((n == 1) || (n == 0)) 
        {
            return n;
        }
        //Calls the method again with, method(n-1) + method(n-2)
        return fiboSeriesRec(n - 1) + fiboSeriesRec(n - 2);
    }
}