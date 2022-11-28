package palindrom;

import java.util.Scanner;

import static palindrom.IsPalindrom.isPal;


public class TestPalindrom {
    public static void main(String[] args) {
        while (true) {

            System.out.println("Введите число");
            Scanner s = new Scanner(System.in);
            String number = s.nextLine();
            if (isPal(number) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
