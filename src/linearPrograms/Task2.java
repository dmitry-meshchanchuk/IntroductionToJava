package linearPrograms;

// Линейные программы. Задание 2

public class Task2 {

    private double z;

    public void calculate (double a, double b, double c){

        z = (b + Math.sqrt(Math.pow(b,2) + 4 * a * c))/(2*a) -  Math.pow(a,3) * c + Math.pow(b,-2);
        System.out.println("Значение выражения = " + z);

    }
}
