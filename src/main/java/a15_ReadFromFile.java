import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class a15_ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Create File\\File1.txt");
        BufferedReader br = new BufferedReader(fr);
        String content = " ";
        while ((content = br.readLine())!=null){
            System.out.println(content);
        }
        fr.close();
    }
}
