package multithreadingEx;

public class MultipalThreads extends Thread {

    public void run(){
        System.out.println("Threa1 ");
    }

    public static void main(String[] args) {
        MultipalThreads th1 = new MultipalThreads();
        th1.start();

        MultipalThreads th2 = new MultipalThreads();
        th2.start();

        MultipalThreads th3 = new MultipalThreads();
        th3.start();

    }
}
