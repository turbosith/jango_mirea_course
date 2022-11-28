package pr6;
import java.io.*;
import java.util.*;
public class MergeSort {


    public static class Student {

        int age;
        int id;
        int rating;

        public Student(int i, int a, int r) {
            id = i;
            age = a;
            rating = r;
        }

        public Student() {

        }
    }
        void merge( Student arr[], int l, int m, int r)
        {
            int n1 = m - l + 1;
            int n2 = r - m;

            Student L[] = new  Student [n1];
            Student R[] = new  Student [n2];

            for (int i=0; i<n1; ++i)
                L[i] = arr[l + i];
            for (int j=0; j<n2; ++j)
                R[j] = arr[m + 1+ j];
            int i = 0, j = 0;

            int k = l;
            while (i < n1 && j < n2)
            {
                if (L[i].id <= R[j].id)
                {
                    arr[k] = L[i];
                    i++;
                }
                else
                {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1)
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2)
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }


        void mergeSort(Student arr[], int l, int r)
        {
            if (l < r)
            {

                int m = (l+r)/2;


                mergeSort(arr, l, m);
                mergeSort(arr , m+1, r);


                merge(arr, l, m, r);
            }
        }


         Student[] mergeArrays(Student[] arr1, Student[] arr2)
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
            while (i < n1)
                arr3[k++] = arr1[i++];
            while (j < n2)
                arr3[k++] = arr2[j++];
            return arr3;
        }

    }





