import java.util.Scanner;

/**
 * Created by a.gusev on 23.08.2017.
 * Reverse a String – Enter a string and the program will reverse it and print it out.
 */
public class ReverseString {

    public static void main(String[] args){
        System.out.print("Enter the String:\n");

        Scanner scanner = new Scanner(System.in);

        StringBuffer buffer = new StringBuffer(scanner.nextLine());
        buffer.reverse();
        System.out.print(buffer.toString());
    }
}
