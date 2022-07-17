package basicmethods;

public class ThreadEx {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("AkashYadav");

        System.out.println(Thread.currentThread().getName());

        System.out.println(10/0);
    }
}
