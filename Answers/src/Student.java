import java.util.Random;

// Создайте класс с именем Student, содержащий поля: 
// фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
// Создайте массив из десяти элементов такого типа. 
// Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.

public class Student {

    String name;
    int groupNumber;
    int[] academicPerformance = new int[5];

    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++) {
            students[0].name = ("Student" + i);

            Random random = new Random();

            students[i].groupNumber = random.nextInt(100) + 1;

            for (int j = 0; j < students[i].academicPerformance.length; j++) {
                students[i].academicPerformance[j] = 5 + random.nextInt(5);
            }
        }
    }
}