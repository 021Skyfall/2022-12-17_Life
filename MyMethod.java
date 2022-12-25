import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;

public class MyMethod {
                                     //매개변수, parameter
    public static void printTwoTimes(String Text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(Text);
        System.out.println(Text);
    } // 메소드
    public static void writefileTwoTimes(String Text, String delimiter) throws IOException {
        FileWriter f = new FileWriter("output.txt");
        f.write(delimiter+"\n");
        f.write(Text+"\n");
        f.write(Text+"\n");
        f.close();
    }

    // 변수 선언해서 그 안에 함수 넣고 메인 출력에는 변수만 넣어서 변수 내부의 값 출력되게 하는 느낌?
    // 반복적으로 필요한 내용에 딱일 것 같음
    // 근데 생각해보니까  이거 전에도 자주 썼었네 ctrl+alt+M

    public static void main(String[] args) {

        printTwoTimes("a", "!");

        printTwoTimes("b", "?");

    }

}
