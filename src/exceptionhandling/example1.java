package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 no: ");

        int a=0, b=0;

        // public String toStrung() {
        //     return a+" , "+b;
        // }

        try {
            a = sc.nextInt();
            b = sc.nextInt();
            int c = a/b;
            // int d = a+b;
            System.out.println("Division is "+c);
            // System.out.println("sum is: "+ d);
        }
        catch(ArithmeticException e){
            System.out.println("Please enter non zero value");
            System.out.println("Exception message "+ e.getMessage());
            System.out.println("Exception mssage "+e.getCause());
            System.out.println("Exception mssage "+e.getLocalizedMessage());

        }
        catch(InputMismatchException ex ){
            System.out.println("Please input int number only");
            System.out.println();
            System.exit(0);
        }
        
            int d = a+b;
            System.out.println("Addition is "+d);
        
        
    }
}
