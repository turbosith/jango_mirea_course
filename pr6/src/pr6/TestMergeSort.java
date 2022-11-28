package pr6;
import pr6.MergeSort.Student;
import pr6.MergeSort.*;



public class TestMergeSort  {
    public static void main(String[] args) {
        Student Andrey=new Student(2,18,4);
        Student Lesha=new Student(1,19,5);
        Student Artem=new Student(122,17,3);
        Student Liza=new Student(4,18,5);
        Student Timofey=new Student(19,21,3);
       Student Ivan=new Student(10,19,4);
        Student [] arrayStud1= new Student[]{Andrey,Lesha,Artem};
        Student [] arrayStud2= new Student[]{Liza,Timofey,Ivan};
        System.out.println("Индексы студентов в получившемся массиве");
        MergeSort mergeSort = new MergeSort();
        Student [] arrayStud3=mergeSort.mergeArrays(arrayStud1,arrayStud2);
        mergeSort.mergeSort(arrayStud3,0,arrayStud3.length-1);
        for (int i =0; i<(arrayStud3.length); i++){
            System.out.print(arrayStud3[i].id+" ");
        }
    }
}
