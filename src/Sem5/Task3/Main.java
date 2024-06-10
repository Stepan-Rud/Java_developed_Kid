package Sem5.Task3;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(4);
        Runner runner1 = new Runner("Runner1", cdl);
        Runner runner2 = new Runner("Runner2", cdl);
        Runner runner3 = new Runner("Runner3", cdl);

        runner1.start();
        runner2.start();
        runner3.start();

        while (cdl.getCount() != 1) {
                Thread.sleep(100);
        }
        comand();
        cdl.countDown();

    }
    static void comand() throws InterruptedException {
        System.out.println("На старт");
        Thread.sleep(100);
        System.out.println("Внимание");
        Thread.sleep(100);
        System.out.println("Марш");
    }
}
