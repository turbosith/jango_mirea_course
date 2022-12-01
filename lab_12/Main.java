package laby.lab_12;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;


/*
1. Необходимо реализовать консольное приложение, позволяющее манипулировать строкой, разбив ее
на элементы путем использования регулярных выражений.
2. Написать регулярное выражение, определяющее является ли данная строка строкой
"abcdefghijklmnopqrstuv18340" или нет.
a) пример правильных выражений: abcdefghijklmnopqrstuv18340
b) пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340
 */

/*
Написать регулярное выражение, определяющее является ли данная строчка датой в формате
dd/mm/yyyy. Начиная с 1900 года до 9999 года.
– пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
– пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.
 */
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    private static final Pattern DATE_PATTERN = Pattern.compile(

            "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[9]|[2-9]\\d)\\d{2})$"
    );

    public static void main(String... args) {
        System.out.println(checkString("29/02/1700"));
        System.out.println(checkString("30/04/2003"));
        System.out.println(checkString("01/01/2003"));
        System.out.println(checkString("29/02/2001"));
        System.out.println(checkString("30-04-2003"));
        System.out.println(checkString("1/1/1899"));
    }

    private static boolean checkString(final String dateAsString) {
        Matcher m = DATE_PATTERN.matcher(dateAsString);
        boolean result = m.matches();
        return result;
    }
}