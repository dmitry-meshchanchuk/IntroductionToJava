package linearPrograms;

// Линейные программы. Задание 4

public class Task4 {
    private double r;
    private double reversNumber;
    private int n;
    private int d;
    private String str;

    public void swap(double r){
        d = (int) (r % 1000);
        n = (int) (r * 1000 - d * 1000);
        str = n + "." + d;
        reversNumber = Double.valueOf(str);
        System.out.println(reversNumber);
    }
}
