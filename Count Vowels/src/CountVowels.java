import java.util.Scanner;

/**
 * Created by a.gusev on 23.08.2017.
 * Count Vowels – Enter a string and the program counts the number of vowels in the text. For added complexity have it report a sum of each vowel found.
 */
public class CountVowels {

    public static void main(String[] args){
        System.out.print("Enter the String:\n");

        Character[] vowelsList = {'a', 'e', 'i', 'o', 'u'};

        StringBuffer buffer = new StringBuffer((new Scanner(System.in)).nextLine());

        int countVowels = 0;
        for (Character s: vowelsList) {
            for(int i = 0; i< buffer.length(); i++){
                if(Character.toLowerCase(buffer.charAt(i)) == s){
                    countVowels++;
                }
            }
            System.out.print("Vowels " + s + " occurs " + countVowels + "\n");
            countVowels = 0;
        }
    }
}
