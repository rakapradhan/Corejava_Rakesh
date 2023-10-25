import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class a16_WriteToTheFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Create File\\File1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Welcome to java");
        bw.newLine();
        bw.write("Selenium is Automation Tool");
        bw.newLine();
        bw.write("Manual Testing is a Also Testing Domain");
        bw.close();
    }
}
