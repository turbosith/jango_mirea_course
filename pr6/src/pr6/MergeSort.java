package pr6;
import java.io.*;
import java.util.*;
public class MergeSort {
    public static class Student{
        int age;
        int id;
        int rating;
        public  Student(int i, int a, int r){
            id=i;
            age=a;
            rating=r;
        }


        public static Student[] mergeArrays(Student[] arr1, Student[] arr2)
        {
            int n1= arr1.length;
            int n2= arr2.length;
            Student[] arr3 = new Student[arr1.length + arr2.length];
            int i = 0, j = 0, k = 0;
            while (i<n1 && j <n2)
            {
                if (arr1[i].id < arr2[j].id)
                    arr3[k++] = arr1[i++];
                else
                    arr3[k++] = arr2[j++];
            }

            // Store remaining elements of first array
            while (i < n1)
                arr3[k++] = arr1[i++];

            // Store remaining elements of second array
            while (j < n2)
                arr3[k++] = arr2[j++];
            return arr3;
        }

    }


}