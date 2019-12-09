package linearPrograms;

// Линейные программы. Задание 1

public class Task1 {

    private double z;


    public void calculate(double a, double b, double c){

        z = ((a-3) * b/2) + c;
        System.out.println("z = " + z);
    }
}
