package javaIoNio.io.ex02;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Klunniy
 */
class PictureFilter implements FileFilter {
    private static final List<String> EXT_LIST = new ArrayList<>();

    public PictureFilter(String... extList) {
        for (String ext : extList) {
            EXT_LIST.add(ext.toLowerCase());
        }
    }

    @Override
    public boolean accept(File pathName) {
        String ext = "";
        if (pathName.isFile()) {
            String name = pathName.getName();
            ext = name
                    .substring(name.lastIndexOf(".") + 1)
                    .toLowerCase();
        }
        return EXT_LIST.contains(ext);
    }
}
