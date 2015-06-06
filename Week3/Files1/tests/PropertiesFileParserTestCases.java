import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import corejava.files.FileUtils;

public class PropertiesFileParserTestCases {
    private static final Path filePath = Paths.get("/home/emilian/tmp/aaa");

    @Before
    public void setUp() throws Exception {
        final String contents = "Batman = Bruce Wayne\n#comment=NO";
        Files.write(filePath, contents.getBytes(Charset.defaultCharset()), StandardOpenOption.CREATE_NEW);
    }

    @After
    public void tearDown() throws Exception {
        Files.deleteIfExists(filePath);
    }

    @Test
    public void testParseProperties() throws IOException {
        File file = filePath.toFile();
        Map<String, String> result = FileUtils.parseProperties(file);
        assertEquals("{Batman = Bruce Wayne}", result.toString());
    }
}
