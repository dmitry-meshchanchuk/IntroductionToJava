package branching;

public class Task1 {
    private int c;
    private int sum = 180; // сумма углов треугольника

    public void triangleSearch(int a, int b){
         c = sum - a - b;

         if (a + b + c == sum && (a == 90 || b == 90 || c == 90)){
             System.out.println("Является прямоугольным треугольником");
         }else if(a + b + c == sum){
             System.out.println("Является непрямоугольным треугольником");
         }else
             System.out.println("Не является треугольником");
    }
}
