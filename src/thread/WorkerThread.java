package thread;

public class WorkerThread implements Runnable{
    String jobno;

    public WorkerThread(String jnno) {
        this.jobno = jnno;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "  Starting job" + jobno);
        doJob();
        System.out.println(Thread.currentThread().getName()+ "  Ending job");
    }
    private void doJob(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

