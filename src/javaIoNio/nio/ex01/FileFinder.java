package javaIoNio.nio.ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileFinder {

    private final File root;
    private final ExtensionFileFilter filter;

    public FileFinder(File root, String... extension) throws FileNotFoundException {
        if (root == null) {
            throw new NullPointerException();
        }

        if (!root.exists()) {
            throw new FileNotFoundException();
        }
        this.root = root;
        this.filter = new ExtensionFileFilter(Arrays.asList(extension));
    }

    public List<File> getAllFiles() {
        return collectFiles(root);
    }

    private List<File> collectFiles(File root) {
        List<File> files = new ArrayList<>();
        File[] currentDir = root.listFiles(filter);
        currentDir = currentDir == null ? new File[0] : currentDir;
        for (File file : currentDir) {
            if (file.isDirectory()) {
                files.addAll(collectFiles(root));
            } else {
                files.add(file);
            }
        }
        return files;
    }
}
