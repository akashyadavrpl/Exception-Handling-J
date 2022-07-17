package basicmethods;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thred is running "+Thread.currentThread().getName());
        Thread.currentThread().setName("akash");
        System.out.println("Thred is running "+Thread.currentThread().getName());

    }
    
    // public void run(String name){
    //     System.out.println("Thred is running "+Thread.currentThread().getName());

    // }
}

public class ThreadEx2 {
    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName());

        Thread1 th1 = new Thread1();
        th1.start();

        Thread1 th2 = new Thread1();
        th2.start();
    }
}
