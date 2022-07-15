package multithreadingEx;

public class TestMulti extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        TestMulti th = new TestMulti();
        th.start();

        TestMulti th1 = new TestMulti();
        th1.start();

        TestMulti th2 = new TestMulti();

        th2.start();
    }
}
