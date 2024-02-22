package thread;

public class ThreadDemo {
    public static void main(String[] args) {

//        Thread th1 = new Thread();
//        Thread th2 = new Thread();
//        Thread th3 = new Thread();
//
//        th1.start();
//        try {
//            System.out.println("The current thread name is: " + Thread.currentThread().getName());
//            th1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        th2.start();
//        try {
//            System.out.println("The current thread name is: " + Thread.currentThread().getName());
//            th2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        th3.start();
//        try {
//            System.out.println("The current thread name is: " + Thread.currentThread().getName());
//            th3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


//        Runnable rThread = new Thread();
//        Thread t1  = new Thread(rThread);
//        t1.start();

        MyThread dbt = new MyThread("dbThread",10);
        dbt.start();
        MyThread nett = new MyThread("netThread",5);
        nett.start();

        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(750);
            } catch (InterruptedException e){
                throw new RuntimeException();
            }
            System.out.println(Thread.currentThread().getName()+"-"
            +i*1000);
        }

        DThread t2 = new DThread();
        t2.setDaemon(true);
        t2.start();
    }
}
