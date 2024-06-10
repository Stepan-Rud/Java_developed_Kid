package dz_sem5;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Philosopher extends Thread{
    private String name;
    private int leftFork;
    private int rightFork;
    private int countEat;
    private Random random;
    private CountDownLatch cdl;
    private Oficiant oficiant;

    public Philosopher(String name, Oficiant oficiant, int leftFork, int rightFork, CountDownLatch cdl) {
        this.oficiant = oficiant;
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.cdl = cdl;
        countEat = 0;
        random = new Random();
    }

    @Override
    public void run() {

        while (countEat < 3) {
            try {
                thinking();
                eating();
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }

        System.out.println(name + " наелся до отвала");
        cdl.countDown();
    }

    private void eating() throws InterruptedException {
        if (oficiant.tryGetForks(leftFork, rightFork)) {
            System.out.println(name + " уплетает вермишель, используя вилки: " + leftFork
                    + " и " + rightFork);
            sleep(random.nextLong(3000, 6000));
            oficiant.putForks(leftFork, rightFork);
            System.out.println(name + " покушал, можно и помыслить. " +
                    "Не забыв при этом вернуть вилки " + leftFork + " и " + rightFork);
            countEat++;
        }

    }

    private void thinking() throws InterruptedException {
        sleep(random.nextLong(100, 2000));
    }
}
