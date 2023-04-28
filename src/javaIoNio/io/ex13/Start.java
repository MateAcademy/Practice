package javaIoNio.io.ex13;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        String path = "D:\\projectsJAVA\\Practice\\src\\io\\io\\ex13\\file.txt";
        try(FileWriter fw = new FileWriter(path, true)) {
            String str = "text";
            fw.write(str);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
