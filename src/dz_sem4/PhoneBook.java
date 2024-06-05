package dz_sem4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Создать справочник сотрудников
 * Необходимо:
 * Создать класс справочник сотрудников, который содержит внутри
 * коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавления нового сотрудника в справочник
 */

public class PhoneBook {
    private HashMap<Integer, Job> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap();
    }
    public void addPhone(Integer id, Job job){
        try {
            if (phoneBook.containsKey(id)) {
                throw new Exeption("Такой табельный номер уже существует");
            }
        } catch (Exeption e) {
            System.out.println(e.getMessage());
        }
        phoneBook.put(id, job);
    }
    public ArrayList<Job> searchExperince(Integer experience){
        ArrayList<Job> jobList = new ArrayList();
        for (Map.Entry <Integer, Job> jobb : phoneBook.entrySet()) {
            if (jobb.getValue().getExperience().equals(experience)) {
                jobList.add(jobb.getValue());
            }
        }
        return jobList;
    }

    public ArrayList<Integer> searchPhone(String name){
        ArrayList<Integer> numberList = new ArrayList();
        for (Map.Entry <Integer, Job> jobb : phoneBook.entrySet()) {
            if (jobb.getValue().getName().equals(name)) {
                numberList.add(jobb.getValue().getPhoneNumber());
            }
        }
        return numberList;
    }

    public Job searchId(Integer id){
        Job job = null;
        for (Map.Entry <Integer, Job> jobb : phoneBook.entrySet()) {
            if (jobb.getKey().equals(id)) {
                job = jobb.getValue();
            }

        }
        return job;
    }

    public void print(){
        for (Map.Entry <Integer, Job> jobb : phoneBook.entrySet()) {
            System.out.println(jobb);
        }
    }
}
