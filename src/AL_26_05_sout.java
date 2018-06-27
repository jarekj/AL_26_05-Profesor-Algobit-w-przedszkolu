import java.io.PrintWriter;
import java.util.Scanner;
// https://pl.spoj.com/problems/AL_26_05/
// time exceeded

public class AL_26_05_sout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

//        String text = "BkoelleokL  i ";
////        String text = "Aaltao km a";

        char[] textArray = text.toCharArray();

        System.out.println(text.length());

        for (int i = 0; i < textArray.length; i+=2) {
            System.out.println(textArray[i]);
        }
        int back;
        if (text.length() % 2 == 0) {
            back = 1;
        } else {
            back = 2;
        }
        for (int i = text.length()-back; i > 0; i-=2) {
            System.out.println(textArray[i]);
        }

    }
}
