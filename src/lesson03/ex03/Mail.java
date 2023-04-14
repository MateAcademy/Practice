package lesson03.ex03;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
public class Mail {
    public static void main(String[] args) {

        File file = new File("src/lesson03/ex03/t1.jpeg");
        System.out.println(new PictureFilter().accept(file));

    }
}

class PictureFilter implements FileFilter {
    private static final List<String> exits = Arrays.asList("jpeg", "jpg");

    @Override
    public boolean accept(File pathName) {
        String ext = "";
        if (pathName.isFile()) {
            String name = pathName.getName();
            ext = name
                    .substring(name.lastIndexOf(".") + 1, name.length() )
                    .toLowerCase();
        }
        return exits.contains(ext);
    }
}