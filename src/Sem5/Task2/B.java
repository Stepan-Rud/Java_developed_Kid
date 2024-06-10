package Sem5.Task2;

public class B implements Runnable {
    String name;
    volatile Boolean switcher = true;

    public B(String name, Boolean switcher) {
        this.name = name;
        this.switcher = switcher;
    }

    @Override
    public void run() {
        int num = 100;
        while (num > 0){
            if (switcher){
                num --;
                System.out.println(num);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}

