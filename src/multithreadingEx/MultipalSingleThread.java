package multithreadingEx;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
class Thread3 extends Thread{
    public void run(){
        System.out.println("Thraed 3");
    }
}

public class MultipalSingleThread extends Thread{
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        Thread3 th3 = new Thread3();

        th1.start();
        th2.start();
        th3.start();
        
        // .start();
        
    }
}
