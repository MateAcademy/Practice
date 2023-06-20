package hillel.lesson7.fils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceDirName = "src";   // - это относительный путь, если путь начинается со слеша / - то это абсолютный путь
        String testFileName = "Test2.java";  //sample.txt
        String testFilePath = sourceDirName + File.separator + testFileName;
        File mainFile = new File(sourceDirName, testFileName);

        File testFile = new File(testFilePath);
        System.out.println(testFile.createNewFile());
        System.out.println(testFile.exists());
        System.out.println(testFile.isFile());
        System.out.println(testFile.isDirectory());

        //дальше мы можем разобрать путь файла:
        System.out.println(testFile.getName());
        System.out.println(testFile.getAbsolutePath());
        System.out.println(testFile.getCanonicalFile());

       long data =  testFile.lastModified(); //отчет времени в программировании 1 янв 1970, мы должны увидеть количество секунд пройденных с этого времени
        System.out.println(new Date(data));
    }
}
