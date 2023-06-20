package hillel.lesson7.tryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test() {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(Paths.get("filename.txt"));
            //read file by line
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
