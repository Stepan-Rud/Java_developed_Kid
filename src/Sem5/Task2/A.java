package Sem5.Task2;

public class A implements Runnable {
    String name;
    volatile Boolean switcher = true;

    public A(String name, Boolean switcher) {
        this.name = name;
        this.switcher = switcher;
    }

    @Override
    public void run() {
        while (true){
            try {
                switcher = !switcher;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
