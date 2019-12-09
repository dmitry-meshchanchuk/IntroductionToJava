import linearPrograms.*;

public class Basics {
    public static void main(String[] args) {
        linearPrograms.Task1 task1 = new Task1();
        task1.calculate(1,2,3);

        linearPrograms.Task2 task2 = new Task2();
        task2.calculate(1,2,5);

        linearPrograms.Task3 task3 = new Task3();
        task3.calculate(1,2);

        linearPrograms.Task4 task4 = new Task4();
        task4.swap(123.321);

        linearPrograms.Task5 task5 = new Task5();
        task5.calculate(1000);

        linearPrograms.Task6 task6 = new Task6();
        task6.pointSearch(3,1);

    }
}
