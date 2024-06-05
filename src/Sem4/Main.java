package Sem4;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.listAdd("Hello");
        task1.listAdd("World");
        task1.listAdd("Hallo");
        System.out.println(task1.getList());
        task1.listSet();
        System.out.println(task1.minValuesSet());
        System.out.println(task1.maxValuesSet());
        task1.deleteAllA();
        System.out.println(task1.getList());
        System.out.println();
        Task2 task2 = new Task2();
        task2.addPhone(152323, "Nikita");
        task2.addPhone(21111, "Sergey");
        task2.addPhone(123123, "Sergeyy");
        task2.addPhone(1323, "Igor");
        System.out.println(task2.getMaxPhone());
        System.out.println(task2.getMinPhone());
        System.out.println();
        System.out.println(task2.maxLenghtNames());
    }
}
