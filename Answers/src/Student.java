import java.util.Random;

// Создайте класс с именем Student, содержащий поля: 
// фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
// Создайте массив из десяти элементов такого типа. 
// Добавьте возможность вывода фамилий и номеров групп студентов,
// имеющих оценки, равные только 9 или 10.

public class Student {

    String name = "";
    int groupNumber;
    int[] academicPerformance = new int[5];

    Student[] students = new Student[10];

    public void makeStudents() {

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student();
            students[i].name = "Student" + (i + 1);

            Random random = new Random();

            students[i].groupNumber = random.nextInt(100) + 1;

            for (int j = 0; j < students[i].academicPerformance.length; j++) {
                students[i].academicPerformance[j] = 8 + random.nextInt(3);
            }
        }
    }

    public void getGoodStudents() {

        for (Student student : students) {

            boolean isGoodStudent = true;

            for (int i = 0; i < 5; i++) {
                if (student.academicPerformance[i] < 9) {
                    isGoodStudent = false;
                }
            }

            if (isGoodStudent) {
                System.out.println("Name: " + student.name);
                System.out.println("Group: " + student.groupNumber);
                System.out.print("Grades: ");

                for (int i = 0; i < academicPerformance.length; i++) {
                    System.out.print(student.academicPerformance[i] + " ");
                }
                System.out.println();
            }
        }
    }
}