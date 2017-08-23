import java.util.Scanner;

/**
 * Created by a.gusev on 23.08.2017.
 */
public class ReverseString {

    public static void main(String[] args){
        System.out.print("Enter String:\n");

        Scanner scanner = new Scanner(System.in);

        StringBuffer buffer = new StringBuffer(scanner.nextLine());
        buffer.reverse();
        System.out.print(buffer.toString());
    }
}
