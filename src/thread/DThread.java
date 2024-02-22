package thread;

public class DThread  extends Thread{
    public void run(){
        while (true) {
            System.out.println("daemon thread");
        }
    }
}
