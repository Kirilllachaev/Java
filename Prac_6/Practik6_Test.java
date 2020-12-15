package Practik6;

public class Test extends Student{
    /*public static void main(String[] args) {
        Student list = new Student(30);
        //Student[] list1 = new Student[30];
        list.arrayCreator();
        System.out.println("Lst: ");
        Student.arrayPrint();
        System.out.println("");
        System.out.println("Sorted lst: ");
        list.insertionSort();
        list.arrayPrint();
    }*/

    public static void main(String[] args)
    {
        var students = Student.madeList();
        for(int i = 0; i < 10; i++){
            System.out.println(students[i]);
        }
        System.out.println("REVERSED:");
        reverse(students);

        for(int i = 0; i < 10; i++){
            System.out.println(students[i]);
        }

        System.out.println("SORTED: ");
        insertionSort(students);

        for(int i = 0; i < 10; i++){
            System.out.println(students[i]);
        }
    }
}