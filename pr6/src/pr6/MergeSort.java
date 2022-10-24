package pr6;

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
        public Student [] mergeArray(Student [] arrayА, Student [] arrayB) {

            Student [] arrayC = new Student[ arrayА.length + arrayB.length];
            int positionA = 0, positionB = 0;

            for (int i = 0; i < arrayC.length; i++) {
                if (positionA == arrayА.length){
                    arrayC[i] = arrayB[i - positionB];
                    positionB++;
                } else if (positionB == arrayB.length) {
                    arrayC[i] = arrayА[i - positionA];
                    positionA++;
                } else if (arrayА[i - positionA].id < arrayB[i - positionB].id) {
                    arrayC[i] = arrayА[i - positionA];
                    positionB++;
                } else {
                    arrayC[i] = arrayB[i - positionB];
                    positionA++;
                }
            }
            return arrayC;}
    }


}