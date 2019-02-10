import java.util.LinkedList;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> listaNumerow = new LinkedList<>();

        for (int i = 0; i < 100 ; i++) {
            listaNumerow.add(random.nextInt(201));
        }

        for (int i = 0; i < 5 ; i++) {
            listaNumerow.remove(random.nextInt(listaNumerow.size()));
        }
        System.out.println(listaNumerow);
        System.out.println(listaNumerow.size());
    }
}
