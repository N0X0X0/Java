package thread;

public class ThreadDemo {
    public static void main(String[] args) {
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
    }
}
