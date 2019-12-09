package linearPrograms;

// Линейные программы. Задание 6

public class Task6 {
    private boolean flag;

    public void pointSearch (int x, int y){

        if (x >= -2 && x <= 2 && y <= 4 && y >=0 || x >= -4 && x <= 4 && y >= -2 && y <= 0){
            flag = true;
        }else {
            flag = false;
        }
        System.out.println(flag);






    }
}
