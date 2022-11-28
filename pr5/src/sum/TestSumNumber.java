package sum;

import java.util.Scanner;

import static sum.SumNumber.sumNumber;

public class TestSumNumber {
    public static void main(String[] arg) {

        Scanner s=new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum=0;
        int x=s.nextInt();
        int y=sumNumber(x, sum);
        System.out.println("Сумма цифр: "+ y);

    }
}
