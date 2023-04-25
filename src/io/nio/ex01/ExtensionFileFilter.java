package io.nio.ex01;

import java.io.File;
import java.io.FileFilter;
import java.util.List;
import java.util.stream.Collectors;

public class ExtensionFileFilter implements FileFilter {

    private final List<String> extensions;

    public ExtensionFileFilter(List<String> extensions) {
        this.extensions = extensions.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    @Override
    public boolean accept(File pathName) {
//        int dotIndex = pathName.getName().lastIndexOf(".");
//        if (dotIndex < 0) {
//            return false;
//        }
//        return extensions.contains(pathName.getName().substring(dotIndex + 1).toLowerCase());

        if (pathName.isDirectory()) {
            return false;
        }
        if (!pathName.getName().contains(".")) {
            return false;
        }

        String name = pathName.getName();
        String ext = name.substring(name.lastIndexOf(".") + 1);
        return extensions.contains(ext.toLowerCase());


    }


}
