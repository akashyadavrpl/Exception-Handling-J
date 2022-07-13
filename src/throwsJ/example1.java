package throwsJ;

public class example1 {
//     public static void main(String[] args) throws Exception{
        
//         Thread.sleep(10000);
//         System.out.println("i am back");
    // }

    public static void main(String[] args) {
        
        try {
            Thread.sleep(1000);
            System.out.println("Hello  am back  ");
        } catch (Exception e) {
            System.out.println("Caught in main");
        }
    }

}
