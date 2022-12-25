import java.io.FileWriter;
import java.io.IOException;

public class MyMethod2 {
    public  static String twotimes(String text, String delimeter) {
        String out = "";
        out = out + delimeter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }

    public static void main(String[] args) throws IOException {


        System.out.println(twotimes("c", "~"));

        FileWriter f = new FileWriter("out.txt");
        f.write(twotimes("a", "~"));
        f.close();

    }
}
