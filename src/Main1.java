import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj cyfrę: ");
            lista.add(scanner.nextInt());
        }
        System.out.println(lista.getLast());
    }
}
