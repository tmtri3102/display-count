import java.util.Arrays;
import java.util.Scanner;

public class DisplayCount {
    public static void main(String[] args) {
        String word = "hello";
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String ch = input.next();
        boolean found = false;


        while(!found) {
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == ch.charAt(0)) {
                    count++;
                    found = true;
                }
            }
            if(!found) {
                System.out.print("Not found. Enter again:  ");
                ch = input.next();
            }
        }

        System.out.print("The character [" + ch + "] appears " + count + " times.");

    }
}
