package Sem5.Task1;

/**
 * В рамках выполнения задачи необходимо:
 * Создать два класс ObjectA, ObjectB
 * Реализовать класс в котором два потока при запуске провоцируют DeadLock для объектов ObjectA, ObjectB
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object objectA = new Object();
        Object objectB = new Object();
        Thread thradOne = new Thread(() -> {
            synchronized (objectA) {
                System.out.println("Ожидаем объект B");
                synchronized (objectB) {
                    System.out.println("Получили объект A");
                }
            }
        });
        Thread thradTwo = new Thread(() -> {
            synchronized (objectB) {
                System.out.println("Ожидаем объект B");
                synchronized (objectA) {
                    System.out.println("Получили объект A");
                }
            }
        });
        thradOne.start();
        thradTwo.start();
//        thradOne.join();
//        thradTwo.join();

    }
}
