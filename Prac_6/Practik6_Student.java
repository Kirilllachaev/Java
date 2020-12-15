package Practik6;
import java.util.Random;

public class Student {
    static Random random = new Random();
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "}";
    }

    /*public static int[] arrayCreator() {
        lst = new Random()
                .ints(1, n + 1)
                .distinct()
                .limit(n)
                .toArray();
        return lst;
    }
    public static void arrayPrint() {
        for(int i = 0; i < lst.length; i++) {
            System.out.print(lst[i] + " ");
        }
    }*/

    static String[] firstnames = new String[] { "Maxon", "Jojo", "Redrick", "Puturidze", "Obama", "Cladmen", "Goga", "Serious Same", "Fridrich", "Gesse" };

    public static Student[] madeList()
    {
        var students = new Student[10];

        for (int i = 1; i <= 10; i++)
        {
            var student = new Student();
            //student.setName(firstnames[i % firstnames.length]);
            student.setName(firstnames[i - 1]);
            student.setId(i);
            students[i - 1] = student;
        }

        return students;
    }
    /*static void randomizer(Student[] array){
        int[] arr = new Random()
                .ints(1, array.length + 1)
                .distinct()
                .limit(array.length)
                .toArray();

        for(int i = 0; i < array.length; i++){
            array[i] = arr[i];
        }
        return array;
    }*/

    static void reverse(Student[] array)
    {
        for (int i = 0; i < array.length / 2; i++) {
            Student temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    static void insertionSort(Student[] array)
    {
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            var value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getId() < array[i].getId()) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }
    /*public static void insertionSort () {
        for (int left = 0; left < lst.length; left++) {
            // Вытаскиваем значение элемента
            int value = lst[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < lst[i]) {
                    lst[i + 1] = lst[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            lst[i + 1] = value;
        }
    }*/
}
