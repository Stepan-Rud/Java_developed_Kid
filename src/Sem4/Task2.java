package Sem4;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * В рамках выполнения задачи необходимо:
 * 1. Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
 * 2. Найдите человека с самым маленьким номером телефона
 * 3. Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */
public class Task2 {
    HashMap <Integer, String> phoneBook;

    public Task2() {
        phoneBook = new HashMap();
    }
    public void addPhone(int number, String name){
        phoneBook.put(number, name);
    }
    public String getPhone(int number){
        return phoneBook.get(number);
    }
    public String getMinPhone(){
        return phoneBook.get(Collections.min(phoneBook.keySet()));
    }
    public String getMaxPhone(){
        return phoneBook.get(Collections.max(phoneBook.keySet()));
    }
    public Integer maxLenghtNames(){
        Integer numberMaxName = 0;
        phoneBook.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
        String maxName = phoneBook.get(Collections.max(phoneBook.entrySet(), Comparator.comparing(Map.Entry::getValue)).getKey());
        for (Map.Entry<Integer, String> number : phoneBook.entrySet()) {
            if (number.getValue().equals(maxName)) {
               numberMaxName = number.getKey();
            }
        }
        return numberMaxName;
    }

    public static class Main {
        public static void main(String[] args) {
            Task2 task2 = new Task2();
            task2.addPhone(152323, "Nikita");
            task2.addPhone(21111, "Sergey");
            task2.addPhone(123123, "Sergeyy");
            task2.addPhone(1323, "Igor");
            System.out.println(task2.getMinPhone());
            System.out.println(task2.getMaxPhone());
            System.out.println(task2.maxLenghtNames());

        }

    }
}
