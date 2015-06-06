package corejava.files;

import java.io.File;

public class ReducePath {
    public static void main(String[] args) {
        System.out.println(reduceFilePath("//asdad/../.././addadad"));
    }

    public static String reduceFilePath(String path) {
        return new File(path).toPath().normalize().toString();
    }
}
