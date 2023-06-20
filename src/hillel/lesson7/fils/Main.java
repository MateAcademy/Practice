package hillel.lesson7.fils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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

        //java nio  - лучше работает с точки зрения многопоточности
        //          - немного быстрее
        //          - нейминг более логичный

        //nio
        Path path = Paths.get("test.txt");
        //Files.createFile(path);
        // мы можем конвертировать file в path и наоборот
        File fromPath = path.toFile();
        Path fromFile = fromPath.toPath();

        Path java = Paths.get("test1.txt");
        Files.createFile(java);
        Files.exists(java);
        Files.size(java);
        Files.getLastModifiedTime(java).toMillis(); //1231914805000
        Files.copy(java, Paths.get("text.txt"), StandardCopyOption.REPLACE_EXISTING);

        Path input = Paths.get("input.txt");
        Path path2 = Paths.get("test.txt");

        Files.copy(input, path2, StandardCopyOption.REPLACE_EXISTING);

    }
}
