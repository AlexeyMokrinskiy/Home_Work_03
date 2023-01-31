import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task_02 {
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    FillList(list);
    OutputList(list);
    OddList(list);
    
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
    public static void OddList(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 != 0){
                System.out.print(integer + " ");
            }
        }
    }
}
