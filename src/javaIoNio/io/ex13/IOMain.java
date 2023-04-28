package javaIoNio.io.ex13;

import java.io.*;

/**
 * @author Serhii Klunniy
 */
public class IOMain {
    private static final String path = "src/javaIoNio/io/ex13/GradeBook.txt";

    public static void main(String[] args) {
        // writeText();
         writePrintWriterText();
        //readFileReaderText();
        // readBufferedReaderText();
        //readBufferedReaderText2();
    }

    private static void writeText() {
        try (FileWriter fw = new FileWriter(path)) {
            String str = "text";
            fw.write("------------------------------\n");
            fw.write(str + "\n");
            fw.write("------------------------------\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writePrintWriterText() {
        try (PrintWriter fw = new PrintWriter(path)) {
            String str = "text";
            fw.write("------------------------------\n");
            fw.write(str + "\n");
            fw.write("------------------------------\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void readFileReaderText() {
        try (FileReader fr = new FileReader(path)) {
            int charFromText;
            while ((charFromText = fr.read()) != -1) {
                System.out.print((char) charFromText);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readBufferedReaderText() {
        try (BufferedReader fr = new BufferedReader(new FileReader(path))) {
            int charFromText;
            while ((charFromText = fr.read()) != -1) {
                System.out.print((char) charFromText);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readBufferedReaderText2() {
        try (BufferedReader fr = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = fr.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
