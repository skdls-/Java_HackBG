import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import corejava.files.FileUtils;

public class WordCountResultTestCases {
    private static final Path filePath = Paths.get("/home/emilian/tmp/aaa");

    @Before
    public void setUp() throws Exception {
        final String contents = "asd asd asd\nasd\na";
        Files.write(filePath, contents.getBytes(Charset.defaultCharset()), StandardOpenOption.CREATE_NEW);
    }

    @After
    public void tearDown() throws Exception {
        Files.deleteIfExists(filePath);
    }

    @Test
    public void testCountChars() throws IOException {
        assertEquals(17, FileUtils.wordCount(filePath).getCharacterCount());
    }

    @Test
    public void testCountLines() throws IOException {
        assertEquals(3, FileUtils.wordCount(filePath).getLineCount());
    }

    @Test
    public void testCountWords() throws IOException {
        assertEquals(5, FileUtils.wordCount(filePath).getWordCount());
    }
}
