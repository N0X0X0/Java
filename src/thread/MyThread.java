package thread;

public class MyThread extends Thread {
    int multiplicand;
    public MyThread(String dbThread, int i) {
        super(dbThread);
        multiplicand = i;
    }

    public void run(){
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+"-"+i*multiplicand);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
