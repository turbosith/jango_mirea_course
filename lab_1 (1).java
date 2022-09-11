import java.util.Random;
import java.util.Scanner;
public class lab_1 {
    public static void main(String[] args) {
        System.out.println("ведите количество элементов массива");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random m = new Random();
        int mas[]= new int[n];
        System.out.println("Массив из случайных чисел:");
        for (int i=0;i<10;i++){
            mas[i]=m.nextInt(100);
            System.out.print( mas[i]+" ");
        }
        System.out.println();
        System.out.println("Отсортированный массив:");
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }



      for (int i=0;i<10;i++){

        System.out.print( mas[i]+" ");
    }
}}
