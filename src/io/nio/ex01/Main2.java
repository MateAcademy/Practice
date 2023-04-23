package io.nio.ex01;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Serhii Klunniy
 */
public class Main2 {
    public static void main(String[] args) {

        String path1 = "C:/Program files" + File.separator + "test " + File.separator + "ava";
        Path path = Paths.get("c", "Program files", "test", "ava");
    }
}
