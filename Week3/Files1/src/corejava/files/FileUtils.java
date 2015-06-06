package corejava.files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileUtils {
    public static void findBrokenLinks(Path path) throws IOException {
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
                if (e == null) {
                    return FileVisitResult.CONTINUE;
                } else {
                    throw e;
                }
            }

            @Override
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
                if (Files.isSymbolicLink(path) && isBrokenLink(path)) {
                    System.out.println(path);
                }
                return FileVisitResult.CONTINUE;
            }
        });
    }

    public static void fixEncoding(Path path) throws IOException {
        byte[] lines = Files.readAllBytes(path);
        byte[] result = new String(lines, "Windows-1251").getBytes("UTF-8");
        Files.write(path, result, StandardOpenOption.WRITE);
    }

    private static boolean isBrokenLink(Path link) throws IOException {
        Path target = Paths.get(Files.readSymbolicLink(link).toString());
        return !Files.exists(target);
    }

    public static void main(String[] args) throws IOException {
        // File("/home/emilian/workspace/Files1/tests/subs.srt");
        // fixEncoding(file.toPath());
        findBrokenLinks(new File("/home").toPath());
    }

    public static Map<String, String> parseProperties(File file) throws IOException {
        Path path = file.toPath();
        List<String> allLines = Files.readAllLines(path, Charset.defaultCharset());
        List<String> lines = new ArrayList<String>();
        for (String line : allLines) {
            if (!line.startsWith("#")) {
                lines.add(line);
            }
        }
        return toMap(lines);
    }

    public static String readFrom(File file) throws IOException {
        Path path = file.toPath();
        return readFrom(path);
    }

    public static String readFrom(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
        String result = "";
        for (String line : lines) {
            result += line;
            result += "\n";
        }
        return result.substring(0, result.length() - 1);
    }

    private static Map<String, String> toMap(List<String> list) {
        Map<String, String> result = new HashMap<String, String>();
        for (String element : list) {
            String key = element.split("=", 2)[0];
            String value = element.split("=", 2)[1];
            result.put(key, value);
        }
        return result;
    }

    public static WordCountResult wordCount(Path path) throws IOException {
        String text = readFrom(path);
        int chars = text.length();
        List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
        List<String> words = new ArrayList<String>();
        for (String line : lines) {
            for (String word : line.split(" ")) {
                words.add(word);
            }
        }
        return new WordCountResult(chars, lines.size(), words.size());
    }

    public static void writeTo(File file, String text) throws IOException {
        Path path = file.toPath();
        writeTo(path, text);
    }

    public static void writeTo(Path path, String text) throws IOException {
        Files.write(path, text.getBytes());
    }

    private FileUtils() {

    }
}
