import java.io.PrintWriter;
import java.util.Scanner;
// https://pl.spoj.com/problems/AL_26_05/
// 0.102 s

public class AL_26_05_sout_substring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        PrintWriter writer = new PrintWriter(System.out);

//        String text = "BkoelleokL  i ";
//        String text = "Aaltao km a";

        for (int i = 0; i < text.length(); i+=2) {
            writer.write(text.substring(i,i+1));
        }
        int back;
        if (text.length() % 2 == 0) {
            back = 1;
        } else {
            back = 2;
        }
        for (int i = text.length()-back; i > 0; i-=2) {
            writer.write(text.substring(i,i+1));
        }
        writer.close();

    }
}
