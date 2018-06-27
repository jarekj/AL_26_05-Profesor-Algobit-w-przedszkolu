import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
// https://pl.spoj.com/problems/AL_26_05/
// 0.61 s

public class AL_26_05_input_buffer_writer {

    public static void main(String[] args) throws java.lang.Exception{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        String text = bf.readLine();
        PrintWriter writer = new PrintWriter(System.out);

//        String text = "BkoelleokL  i";
//        String text = "Aaltao km a";

        char[] textArray = text.toCharArray();

        for (int i = 0; i < textArray.length; i+=2) {
            writer.write(textArray[i]);
        }
        int back;
        if (text.length() % 2 == 0) {
            back = 1;
        } else {
            back = 2;
        }
        for (int i = text.length()-back; i > 0; i-=2) {
            writer.write(textArray[i]);
        }
        writer.close();
    }
}
