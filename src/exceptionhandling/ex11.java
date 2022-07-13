package exceptionhandling;

class ex12{

    public void message(String s){
         try{
            System.out.println("In Try of ex12");
            throw new ArithmeticException();
            
         }catch(Exception ex){
            System.out.println("Catch in ex12");
            // throw new NullPointerException();
            System.out.println("hiii");
            int x = 1/0;
         }
    }
}

public class ex11 {
    public static void main(String[] args) {

        ex12 obj = new ex12();

        try {
            obj.message("akash yadav");
            System.out.println("In main");
        } catch (Exception e) {
           
            System.out.println("Handeled in main");
        }
        
    }
}
