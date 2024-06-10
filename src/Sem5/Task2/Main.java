package Sem5.Task2;

import java.util.Stack;

/**
 * В рамках выполнения задачи необходимо:
 * Создайте два потока A и B.
 * Поток A меняет значение Boolean переменной switcher с задержкой 1000 миллисекунд
 * (true в состояние false и наоборот).
 * Поток B ожидает состояния true переменной switcher и выводит на консоль обратный отсчет от 100
 * с задержкой 100 миллисекунд и приостанавливает свое действие, как только поток A переключит switcher
 * в состояние false.
 * Условием завершения работы потоков является достижение отсчета нулевой отметки.
 * Можно воспользоваться синхронизацией для управления значения переменной или volatile
 */
public class Main {
    static volatile boolean switcher = false;
    static volatile boolean flag = true;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            while (flag){
                try {
                    switcher = !switcher;
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread threadB = new Thread(() -> {
            int num = 100;
            while (num >= 0){
                if (switcher) {
                    System.out.println(num);
                    num--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            flag = false;

        });
        threadA.start();
        threadB.start();
//        Boolean switcher = true;
//        A a = new A("A", switcher);
//        B b = new B("B", switcher);
//        Thread aT = new Thread(a);
//        Thread bT = new Thread(b);
//        aT.start();
//        bT.start();
    }
}
