package basicmethods;

import java.security.cert.TrustAnchor;

public class DemonThread extends Thread{
     public void run(){
        System.out.println("In the run method");

        if(Thread.currentThread().isDaemon()){
            System.out.println("Demon thred "+ Thread.currentThread().getName());
        }else{
            System.out.println("Main thread");
        }
     }

     public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        DemonThread th = new DemonThread();
        th.setDaemon(true);
        System.out.println(th.getPriority());
        th.setPriority(6);
        th.start();
        System.out.println(Thread.currentThread().isDaemon());
     }
}
