package multithreadingEx;

public class SingleTherad extends Thread{

    public void run(){
        System.out.println("Run thread 1");
    }

    public static void main(String[] args) {
        
        SingleTherad st = new SingleTherad();

        st.start();
    }
}
