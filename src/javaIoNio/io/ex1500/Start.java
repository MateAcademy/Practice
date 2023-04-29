package javaIoNio.io.ex1500;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Serhii Klunniy
 * заметки здесь в задании можно вызвать while(true) EOFExeption и можно сделать цикл добавить проверку какого то поля
 * у студента и если такое поле есть то перестать считывать файл, выйти из while(...)
 */
public class Start {
    public static void main(String[] args) throws IOException {
        Set<SubjectGrades> grades = new HashSet<>();
        grades.add(new SubjectGrades("math" , 8));
        grades.add(new SubjectGrades("sport" , 12));
        Student student = new Student("Serhii", 56.4f, grades);

        Path path = Path.of("src/javaIoNio/io/ex15/file.bin");

//        Writer writer = new Writer();
//        writer.writer(path , student);

        Reader r = new Reader();
        Student student1 = r.reader(path);

        System.out.println(student1);
    }
}
