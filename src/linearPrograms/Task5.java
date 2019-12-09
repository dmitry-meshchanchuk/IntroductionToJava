package linearPrograms;

// Линейные программы. Задание 5

public class Task5 {

    private int hours;
    private int minutes;
    private int seconds;

    public void calculate (int t){
        hours = t/3600;
        minutes = (t - hours * 3600)/60;
        seconds = t - hours * 3600 - minutes * 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds + "с ");
    }
}
