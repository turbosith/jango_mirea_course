package laby.lab_7;
// сдано
import java.util.LinkedList;

// Протестировать работу коллекции LinkedList.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();
// добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1
        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){
            System.out.println(state);
        }
// проверка на наличие элемента в списке
        if(states.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }
        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента


        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента
        for(Person p : people){
            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
    static class Person{
        private String name;
        public Person(String value){
            name=value;
        }
        String getName(){return name;}
    }
}

