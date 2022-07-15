
package multithreadingEx;

public class example2 implements Runnable {
    
    public void run(){
        System.out.println("Hello, implements Runnable");
    }

    public static void main(String[] args) {
        example2 ex = new example2();

        Thread th = new Thread(ex);
        th.start();
    }
}
