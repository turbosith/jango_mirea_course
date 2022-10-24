package pr5;
import java.util.Scanner;
import pr5.IsPrime;

import static pr5.IsPrime.isPrime;

public class TestIsPrime {
    public static void main(String[] args) {
        while (true){
        System.out.println("Введите число");
        Scanner s= new Scanner(System.in);
        int number=s.nextInt();
        if(isPrime(number)==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
    }
}
