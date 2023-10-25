import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a4_CreateANewFile {
    public static void main(String[] args) throws IOException {
            File file = new File("C:\\Users\\Create File\\NewFile.txt");

                if (file.createNewFile()) {
                    System.out.println("File is created");
                } else {
                    System.out.println("File already exists in the folder");
                }
    }
}
