package laby.prac_13_14;

import java.text.SimpleDateFormat;
import java.util.*;
/*
Задание 1. (20%)Написать программу, выводящую фамилию разработчика, дату и время получения задания, а также
дату и время сдачи задания. Для получения последней даты и времени использовать класс Date из пакета
java.util.* (Объявление Dated=newDate() или метод System.currentTimeMillis().
Задание 2. (20%)
Приложение, сравнивающее текущую дату и дату, введенную пользователем c текущим системным
временем
Задание 3. (20%)
Доработайте класс Student предусмотрите поле для хранения даты рождения, перепишите метод
toString() таким образом, чтобы он разработайте метод, возвращал строковое представление даты рождения
по вводимому в метод формату даты (например, короткий, средний и полный формат даты).
 */
public class Main {
    public static void main(String[] args) {
        // ЗАДАНИЕ 1
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date now = new Date();
        System.out.println("ФИО разработчика:\tЕвдокимов ДИ");
        System.out.println("Дата разработки:\t27.11.2022");
        System.out.println("Текущая дата:\t\t" + sdf.format(now));
        System.out.println();

        // ЗАДАНИЕ 2
        Scanner in = new Scanner(System.in);
        String inputDate;
        System.out.print("Введите день, месяц и год в формате dd.MM.yyyy: ");
        inputDate = in.next();
        System.out.println(sdf.format(now).equals(inputDate));

        // ЗАДАНИЕ 3
        Student s1 = new Student("Евгений", 3.0, new SimpleDateFormat("dd.MM.yyyy"), new Date());
        Student s2 = new Student("Анатолий", 4.8, new SimpleDateFormat("dd.MM.yyyy ss"), new Date());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println();

    }
}
