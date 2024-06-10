package Sem5.Task3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Runner extends Thread{
    private String name;
    static Random random = new Random();
    private CountDownLatch cdl;
    public Runner(String name, CountDownLatch cdl) {
        this.cdl = cdl;
        this.name = name;
    }
    public void goTostart() throws InterruptedException {
        System.out.println(name + " Движется к линии старта");
        Thread.sleep(random.nextInt(1000, 2000));
        System.out.println(name + " Прибыл на линию старта");
        cdl.countDown();

    }

    public void goToFinish() throws InterruptedException {
        System.out.println(name + " Движется к линии финиша");
        Thread.sleep(random.nextInt(1000, 2000));
        System.out.println(name + " Прибыл на линию финиша");
    }
    @Override
    public void run() {
        try {
            goTostart();
            cdl.await();
            goToFinish();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };
}
