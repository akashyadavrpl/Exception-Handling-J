package exceptionhandling;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=0;

        try{
            System.out.println("Enter Number");
            a = sc.nextInt();
            b = sc.nextInt();

            if(a<=0){
                ArithmeticException obj = new ArithmeticException("Numerator should be positive");
                throw obj;
            }
            int c = a/b;
            System.out.println("Division is "+c);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        int d= a+b;
        System.out.println("Sum is "+d);
        
    }
}
