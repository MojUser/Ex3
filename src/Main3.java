import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
        //1.Użycie lines
//        Path filePath = Paths.get("Input");
//        List<String> lines = Files.readAllLines(filePath);
////        System.out.println(lines);
        //2. BufferedReader
        FileReader reader = new FileReader("Input");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<String> stringList = new LinkedList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            stringList.add(line);
            line = bufferedReader.readLine();
        }
        //Using For loop
        for (int i = 0; i < stringList.size() ; i++) {
            if( stringList.get(i).equals("User1")) {
                stringList.remove(i);
            }
        }
        //Using Remove if and lambda
        stringList.removeIf(a -> a.equals("User1"));
        String firstAttacker = "";

        for (int i = 0; i < stringList.size() ; i++) {
            if(stringList.get(i).equals("User6") || stringList.get(i).equals("User7")){
                firstAttacker = stringList.get(i);
                break;
            }
        }
        System.out.println("The first attacker was: " + firstAttacker);
        System.out.println("Log size without User1: " + stringList.size());
    }
}
