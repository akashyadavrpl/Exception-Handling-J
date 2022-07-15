
package multithreadingEx;

class Test extends Thread{

    @Override
    public void run(){
        System.out.println("Hello, extends Theard");
    }
    

    public static void main(String[] args) {
        Test t = new Test();

        t.start();
    }
}