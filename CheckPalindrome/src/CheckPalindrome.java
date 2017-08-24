import java.util.Scanner;

/**
 * Created by a.gusev on 23.08.2017.
 * Check if Palindrome – Checks if the string entered by the user is a palindrome. That is that it reads the same forwards as backwards like “racecar”
 */
public class CheckPalindrome {

    public static void main(String[] args){
        System.out.print("Enter the String:\n");

        StringBuffer buffer = new StringBuffer((new Scanner(System.in)).nextLine());
        String sourceString = buffer.toString();

        if(buffer.reverse().toString().toUpperCase().equals(sourceString.toUpperCase())){
            System.out.print("This string is palindrome!");
        }
        else{
            System.out.print("This string is not palindrome!");
        }
    }

}
