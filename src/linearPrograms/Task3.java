package linearPrograms;

// Линейные программы. Задание 3

public class Task3 {

    private double z;

    public void calculate(double x, double y){

        z = (Math.sin(x) + Math.sin(y))/(Math.sin(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("Значение выражения = " + z);
    }
}
