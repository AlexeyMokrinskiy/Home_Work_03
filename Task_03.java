import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф из этого списка.

public class Task_03 {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    FillList(list);
    OutputList(list);
    MaxValue(list);
    MinValue(list);
    Avereg(list);
    }
    public static void FillList(List<Integer> list) {
    Random random = new Random();
    for (int index = 0; index < 10; index++) {
        int rand = random.nextInt(100);
        list.add(rand);
        }
    }
    public static void OutputList(List<Integer> list) {
    for (Integer integer: list) {
        System.out.print(integer + " ");
        }
    System.out.println();
    }
    public static void MaxValue(List<Integer> list) {
        int max = 0;
        for (Integer integer: list) {
            if (max < integer){
                max = integer;
                integer++;
            }
        }
        System.out.println("Максимальное значение " + max);
    }
    public static void MinValue(List<Integer> list) {
        int min = 100; // максимальное значение из метода FillList
        for (Integer integer: list) {
            if (min > integer){
                min = integer;
                integer++;
            }
        }
        System.out.println("Минимальное значение " + min);
    }
    public static void Avereg(List<Integer> list) {
        float sum = 0;
        for (int item : list) {
        sum += item;
            }
        float avereg = sum / list.size();
        System.out.println("Среднее арифметическое " + avereg);
    }
}
