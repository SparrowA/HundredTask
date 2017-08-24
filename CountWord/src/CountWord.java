import java.io.FileInputStream;
import java.io.FileNotFoundException;;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by a.gusev on 24.08.2017.
 * Counts the number of individual words in a string. For added complexity read these strings in from a text file and generate a summary.
 */
public class CountWord {

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(new FileInputStream("CountWord/src/input.txt"));
            List<String> listWord = new ArrayList<>();
            HashMap<String, Integer> countWords = new HashMap<>();

            while(scanner.hasNextLine()){
                for (String s : scanner.nextLine().split(" ")) {
                    Integer count = countWords.get(s.toUpperCase());
                    if (count == null){
                        listWord.add(s);
                        count = 0;
                    }
                    countWords.put(s.toUpperCase(), count + 1);
                }
            }

            for(String s : listWord){
                StringBuilder builder = new StringBuilder(s)
                        .append(" ")
                        .append(countWords.get(s.toUpperCase()));

                System.out.println(builder);
            }
        }
        catch (FileNotFoundException e) {
            System.out.print("File not found");
        }
    }
}
