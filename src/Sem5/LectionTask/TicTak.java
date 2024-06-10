package Sem5.LectionTask;

public class TicTak extends Thread{
    private int count;
    private final Object monitor;
    public TicTak(int count) {
        this.count = count;
        this.monitor = TicTak.class;
    }

    @Override
    public void run() {
        while (true){
            synchronized (monitor){
                System.out.println(count + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                    monitor.notify();
                    monitor.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
