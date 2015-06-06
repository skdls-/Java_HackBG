import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import corejava.files.FileUtils;

public class FileUtilsTestCase {

    File file = new File("/home/emilian/workspace/Files1/tests/testFile");

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testReadFromFile() {
        try {
            assertEquals("line1\nline2", FileUtils.readFrom(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadFromPath() {
        try {
            assertEquals("line1\nline2", FileUtils.readFrom(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWriteToFile() {
        File file = new File("/home/emilian/workspace/Files1/tests/testWriteFile");
        String text = "babababa";
        try {
            FileUtils.writeTo(file, text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assertEquals(text, FileUtils.readFrom(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testWriteToPath() {
        File file = new File("/home/emilian/workspace/Files1/tests/testWriteFile");
        Path path = file.toPath();
        String text = "babababa";
        try {
            FileUtils.writeTo(path, text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assertEquals(text, FileUtils.readFrom(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
